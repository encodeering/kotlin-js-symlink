Running `./gradlew build` within WSL terminal creates the following two symlinks

```
ls -la build/js/node_modules | grep kotlin-js-symlink-ui
lrwxrwxrwx 1 ... kotlin-js-symlink-ui -> ../packages/kotlin-js-symlink-ui
lrwxrwxrwx 1 ... kotlin-js-symlink-ui-test -> ../packages/kotlin-js-symlink-ui-test
```
