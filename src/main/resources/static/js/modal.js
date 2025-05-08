
const modal = document.getElementById("progressModal");
const checkIcon = document.querySelector(".check-icon");
const waitMessage = document.querySelector(".modal-wait-message");
const signupBtn  = document.querySelector("#signupBtn");
const loader = document.querySelector(".loader");


function initModal(){
    waitMessage.textContent = "잠시만 기다려주세요..."; // (대기 멘트)
    waitMessage.classList.remove("success"); // 초록색을 기본상태로 (대기 상황)
    loader.classList.remove("hidden"); // 로딩창 보이게하기(대기 상황)
    checkIcon.classList.add("hidden"); // 성공창 숨기기 (대기 상황)
    modal.classList.remove("hidden"); // 모달 보이기 (대기 상황)
}
function successModal(){
    waitMessage.textContent = "회원가입 성공!!!"; // (성공)
    waitMessage.classList.add("success"); // (성공)
    checkIcon.classList.remove("hidden"); // 체크 (성공 상황)    
    loader.classList.add("hidden"); // (대기 상태를 안보이게 하기)
}
function destroyModal(){
    checkIcon.classList.add("hidden"); // (성공 상황)
    waitMessage.classList.add("success");
            
    modal.classList.add("hidden"); // 모달 숨기기
}