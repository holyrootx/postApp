
const idCheck = {
  defaultIcon : document.querySelector(".id-check-default-icon"),
  messageBox : document.querySelector(".modal-id-check-message-box"),
  successIcon : document.querySelector(".id-check-success-icon"),
  failedIcon : document.querySelector(".id-check-failed-icon"),
  defaultMessage : "아이디를 검사하고 있어요.",
  successMessage : "사용 가능한 아이디예요!",
  failedMessage : "사용 불가한 아이디에요."
};
const passwordCheck = {
  defaultIcon : document.querySelector(".password-check-default-icon"),
  messageBox : document.querySelector(".modal-password-check-message-box"),
  successIcon : document.querySelector(".password-check-success-icon"),
  failedIcon : document.querySelector(".password-check-failed-icon"),
  defaultMessage : "비밀번호를 검사하고 있어요.",
  successMessage : "사용 가능한 비밀번호예요!",
  failedMessage : "사용 불가한 비밀번호예요."
};

const emailCheck = {
  defaultIcon : document.querySelector(".email-check-default-icon"),
  messageBox : document.querySelector(".modal-email-check-message-box"),
  successIcon : document.querySelector(".email-check-success-icon"),
  failedIcon : document.querySelector(".email-check-failed-icon"),
  defaultMessage : "이메일을 검사하고 있어요.",
  successMessage : "사용 가능한 이메일이에요!",
  failedMessage : "사용 불가한 이메일이에요."
};

const nameCheck = {
  defaultIcon : document.querySelector(".name-check-default-icon"),
  messageBox : document.querySelector(".modal-name-check-message-box"),
  successIcon : document.querySelector(".name-check-success-icon"),
  failedIcon : document.querySelector(".name-check-failed-icon"),
  defaultMessage : "이름을 검사하고 있어요.",
  successMessage : "사용 가능한 이름이에요!",
  failedMessage : "사용 불가한 이름이에요."
};

const serverCheck = {
  defaultIcon : document.querySelector(".server-check-default-icon"),
  messageBox : document.querySelector(".modal-server-check-message-box"),
  successIcon : document.querySelector(".server-check-success-icon"),
  failedIcon : document.querySelector(".server-check-failed-icon"),
  defaultMessage : "서버에서 검사하고 있어요.",
  successMessage : "아이디를 생성 중 입니다.",
  failedMessage : "생성 불가한 아이디에요."
};

function initModal(){
  const modal = document.getElementById("progressModal");
  const loader = document.querySelector(".loader");

  modal.classList.remove("hidden");
  loader.classList.remove("hidden");
}

function destroyModal(){
  const modal = document.getElementById("progressModal");
  const loader = document.querySelector(".loader");
  
  const checkBoxes = document.querySelectorAll(".validation-status");
  const fields = ["아이디를","비밀번호를","이메일을","이름을","서버에서"];

  checkBoxes.forEach((box,index) => {
      box.querySelector(".fa-circle-exclamation").classList.remove("hidden");
      box.querySelector(".fa-circle-check").classList.add("hidden");
      box.querySelector(".fa-circle-xmark").classList.add("hidden");
      box.querySelector("p").textContent = `${fields[index]} 검사하고 있어요.`;
  });

  loader.classList.add("hidden");
  modal.classList.add("hidden");
}

function success(result){
  result.failedIcon.classList.add("hidden");
  result.defaultIcon.classList.add("hidden");
  result.successIcon.classList.remove("hidden");
  result.messageBox.textContent = result.successMessage;
}

function failed(result){
  result.defaultIcon.classList.add("hidden");
  result.failedIcon.classList.remove("hidden");
  result.messageBox.textContent = result.failedMessage;
}