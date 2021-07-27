import gulp from "gulp";
import sass from "gulp-sass";
import autoprefixer from "gulp-autoprefixer";

sass.compiler = require("node-sass");

const sassPath: string = "src/resources/scss/**/*.scss";

gulp.task("sass", () => {
  return gulp
    .src(sassPath)
    .pipe(sass().on("err:", sass.logError))
    .pipe(gulp.dest("src/resources/static/dist/css"));
});

gulp.task("sass:watch", () => {
  gulp.watch(sassPath, ["sass"]);
});
