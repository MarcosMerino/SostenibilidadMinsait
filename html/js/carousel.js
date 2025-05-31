let counter = 0;
const slide = document.querySelector('.carousel-slide');
const images = document.querySelectorAll('.carousel-slide img');

function nextSlide() {
  counter++;
  if (counter >= images.length) {
    counter = 0;
  }
  slide.style.transform = `translateX(${-600 * counter}px)`;
}

setInterval(nextSlide, 3000);