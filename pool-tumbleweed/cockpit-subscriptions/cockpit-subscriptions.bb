SUMMARY = "Cockpit module for managing and registering subscriptions"
DESCRIPTION = "A Cockpit module for managing and registering subscriptions"
LICENSE = "LGPL-2.1-or-later"

PV = "16.3"

RPM_NAME = "cockpit-subscriptions-16.3-1.1.noarch.rpm"
RPM_HASH = "38ed3104e36788e2045b544768f34f5927fc031534a8bd04514385e5ba94886b13b5e68875e905bd38cc46c8cda710d3edc0534335d5845ca0650d2e4596af3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bundled-npm(@bufbuild/protobuf) \
bundled-npm(@esbuild/aix-ppc64) \
bundled-npm(@esbuild/android-arm) \
bundled-npm(@esbuild/android-arm64) \
bundled-npm(@esbuild/android-x64) \
bundled-npm(@esbuild/darwin-arm64) \
bundled-npm(@esbuild/darwin-x64) \
bundled-npm(@esbuild/freebsd-arm64) \
bundled-npm(@esbuild/freebsd-x64) \
bundled-npm(@esbuild/linux-arm) \
bundled-npm(@esbuild/linux-arm64) \
bundled-npm(@esbuild/linux-ia32) \
bundled-npm(@esbuild/linux-loong64) \
bundled-npm(@esbuild/linux-mips64el) \
bundled-npm(@esbuild/linux-ppc64) \
bundled-npm(@esbuild/linux-riscv64) \
bundled-npm(@esbuild/linux-s390x) \
bundled-npm(@esbuild/linux-x64) \
bundled-npm(@esbuild/netbsd-arm64) \
bundled-npm(@esbuild/netbsd-x64) \
bundled-npm(@esbuild/openbsd-arm64) \
bundled-npm(@esbuild/openbsd-x64) \
bundled-npm(@esbuild/openharmony-arm64) \
bundled-npm(@esbuild/sunos-x64) \
bundled-npm(@esbuild/win32-arm64) \
bundled-npm(@esbuild/win32-ia32) \
bundled-npm(@esbuild/win32-x64) \
bundled-npm(@parcel/watcher) \
bundled-npm(@parcel/watcher-android-arm64) \
bundled-npm(@parcel/watcher-darwin-arm64) \
bundled-npm(@parcel/watcher-darwin-x64) \
bundled-npm(@parcel/watcher-freebsd-x64) \
bundled-npm(@parcel/watcher-linux-arm-glibc) \
bundled-npm(@parcel/watcher-linux-arm-musl) \
bundled-npm(@parcel/watcher-linux-arm64-glibc) \
bundled-npm(@parcel/watcher-linux-arm64-musl) \
bundled-npm(@parcel/watcher-linux-x64-glibc) \
bundled-npm(@parcel/watcher-linux-x64-musl) \
bundled-npm(@parcel/watcher-win32-arm64) \
bundled-npm(@parcel/watcher-win32-x64) \
bundled-npm(@patternfly/patternfly) \
bundled-npm(@patternfly/react-core) \
bundled-npm(@patternfly/react-icons) \
bundled-npm(@patternfly/react-styles) \
bundled-npm(@patternfly/react-tokens) \
bundled-npm(argparse) \
bundled-npm(attr-accept) \
bundled-npm(chokidar) \
bundled-npm(colorjs.io) \
bundled-npm(content-type) \
bundled-npm(detect-libc) \
bundled-npm(encoding) \
bundled-npm(es-errors) \
bundled-npm(esbuild) \
bundled-npm(esbuild-sass-plugin) \
bundled-npm(file-selector) \
bundled-npm(focus-trap) \
bundled-npm(function-bind) \
bundled-npm(gettext-parser) \
bundled-npm(has-flag) \
bundled-npm(hasown) \
bundled-npm(iconv-lite) \
bundled-npm(immutable) \
bundled-npm(is-core-module) \
bundled-npm(is-extglob) \
bundled-npm(is-glob) \
bundled-npm(js-tokens) \
bundled-npm(loose-envify) \
bundled-npm(node-addon-api) \
bundled-npm(object-assign) \
bundled-npm(path-parse) \
bundled-npm(picomatch) \
bundled-npm(prop-types) \
bundled-npm(react) \
bundled-npm(react-dom) \
bundled-npm(react-dropzone) \
bundled-npm(react-is) \
bundled-npm(readdirp) \
bundled-npm(resolve) \
bundled-npm(rxjs) \
bundled-npm(safer-buffer) \
bundled-npm(sass) \
bundled-npm(sass-embedded) \
bundled-npm(sass-embedded-all-unknown) \
bundled-npm(sass-embedded-android-arm) \
bundled-npm(sass-embedded-android-arm64) \
bundled-npm(sass-embedded-android-riscv64) \
bundled-npm(sass-embedded-android-x64) \
bundled-npm(sass-embedded-darwin-arm64) \
bundled-npm(sass-embedded-darwin-x64) \
bundled-npm(sass-embedded-linux-arm) \
bundled-npm(sass-embedded-linux-arm64) \
bundled-npm(sass-embedded-linux-musl-arm) \
bundled-npm(sass-embedded-linux-musl-arm64) \
bundled-npm(sass-embedded-linux-musl-riscv64) \
bundled-npm(sass-embedded-linux-musl-x64) \
bundled-npm(sass-embedded-linux-riscv64) \
bundled-npm(sass-embedded-linux-x64) \
bundled-npm(sass-embedded-unknown-all) \
bundled-npm(sass-embedded-win32-arm64) \
bundled-npm(sass-embedded-win32-x64) \
bundled-npm(scheduler) \
bundled-npm(source-map-js) \
bundled-npm(supports-color) \
bundled-npm(supports-preserve-symlinks-flag) \
bundled-npm(sync-child-process) \
bundled-npm(sync-message-port) \
bundled-npm(tabbable) \
bundled-npm(tslib) \
bundled-npm(varint) \
cockpit-subscriptions"

RDEPENDS:${PN} += "cockpit-bridge \
suseconnect-ng"

inherit rpm
