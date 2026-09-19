SUMMARY = "Hare C bindings for libnotify"
DESCRIPTION = "An attempt to create Hare bindings for libnotify."
LICENSE = "MPL-2.0"

PV = "1.0.1"

RPM_NAME = "hare-libnotify-1.0.1-1.4.noarch.rpm"
RPM_HASH = "69bfc7e516c6740ed3ebb8cd2741fb9553f4642be9f43969f934ba292727b5f6a17db209a432a648de5723ef0a7e7a43f899e2b3e976fcac6532ba32c56c7320"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hare-libnotify"

RDEPENDS:${PN} += ""

inherit rpm
