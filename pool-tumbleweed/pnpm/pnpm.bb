SUMMARY = "Package manager for node.js"
DESCRIPTION = "Fast, disk space efficient package manager for node.js"
LICENSE = "MIT"

PV = "11.9.0"

RPM_NAME = "pnpm-11.9.0-1.1.noarch.rpm"
RPM_HASH = "d5fe3262cf3465de8579cef27c9461134de4237387d325485e077acf05b1fe9fca76845b740bcf5ec4f6d9b8ad943bd0d11a335d6792781246f52dcbb0609c3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "npm-pnpm \
pnpm"

RDEPENDS:${PN} += "/usr/bin/node \
/usr/bin/sh \
bash \
nodejs"

inherit rpm
