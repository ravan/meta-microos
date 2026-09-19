SUMMARY = "Bobcat static library"
DESCRIPTION = "Bobcat static library"
LICENSE = "GPL-3.0-only"

PV = "6.15.01"

RPM_NAME = "libbobcat-light-devel-static-6.15.01-1.1.aarch64.rpm"
RPM_HASH = "a56c63cbc1802f3cdb6061c3e08eb2d9eafb44d7dbca57e28ae9c5b4033faf685fd7661995e9de5386c1e0a85569e6cea3068ef1ab8094154f04f1d8861e7686"

RPROVIDES:${PN} += "libbobcat-light-devel-static"

RDEPENDS:${PN} += ""

inherit rpm
