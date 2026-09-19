SUMMARY = "Headers for the unstable API of the Qt5 BodyMovin library"
DESCRIPTION = "You need this package if you want to compile programs against the unstable API \
of the Qt5 BodyMovin library."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.19+kde0"

RPM_NAME = "libQt5Bodymovin-private-headers-devel-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "f8be8efdcfd578b191f1f92535bc4a17c5160bb1909cfc2856086e6a7a352533551a0b141dec2a7f1ba6eaccc707ab51c692c87772fc1c1e7c9905e5b19cd5ec"

RPROVIDES:${PN} += "libQt5Bodymovin-private-headers-devel"

RDEPENDS:${PN} += "libQt5Bodymovin-devel"

inherit rpm
