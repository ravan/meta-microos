SUMMARY = "Development files for cinnamon-screensaver"
DESCRIPTION = "Development files for cinnamon-screensaver. \
 \
Development files for cinnamon-screensaver."
LICENSE = "GPL-2.0-or-later"

PV = "6.6.1"

RPM_NAME = "cinnamon-screensaver-devel-6.6.1-1.4.aarch64.rpm"
RPM_HASH = "a49a46e5b2eab79759f1f80f572d78041c5ae368ad0ef6b01654191d2ed7bce766826865a6b2ee9dd29124e312a6e6dd644e371595384d1c580d773d9a674474"

RPROVIDES:${PN} += "cinnamon-screensaver-devel"

RDEPENDS:${PN} += "typelib-1-0-CScreensaver-1-0"

inherit rpm
