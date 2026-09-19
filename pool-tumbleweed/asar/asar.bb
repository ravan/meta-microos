SUMMARY = "Creating atom-shell (electron) app packages"
DESCRIPTION = "Asar is a simple extensive archive format, it works like tar \
that concatenates all files together without compression, while \
having random access support."
LICENSE = "MIT & ISC"

PV = "4.0.0"

RPM_NAME = "asar-4.0.0-1.4.noarch.rpm"
RPM_HASH = "c1ec014058d3b0d948b5681f1af0bc4e38e676e3201c9278bbaaba6e9566fca5ee1cbc866d47a753eeb4656805ef01fbfd134269830e38879e5f010c4c3229d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "asar \
nodejs-asar \
npm-@electron/asar \
own-@isaacs/cliui \
own-ansi-regex \
own-ansi-styles \
own-balanced-match \
own-brace-expansion \
own-color-convert \
own-color-name \
own-commander \
own-cross-spawn \
own-eastasianwidth \
own-emoji-regex \
own-foreground-child \
own-glob \
own-is-fullwidth-code-point \
own-isexe \
own-jackspeak \
own-lru-cache \
own-minimatch \
own-minipass \
own-package-json-from-dist \
own-path-key \
own-path-scurry \
own-shebang-command \
own-shebang-regex \
own-signal-exit \
own-string-width \
own-strip-ansi \
own-which \
own-wrap-ansi"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/node \
nodejs-engine"

inherit rpm
