SUMMARY = "udev rules for libnitrokey"
DESCRIPTION = "Libnitrokey is a project to communicate with Nitrokey Pro and Storage devices \
in a clean and easy manner. \
 \
This package holds the udev rules."
LICENSE = "LGPL-3.0-only"

PV = "3.8"

RPM_NAME = "libnitrokey-udev-3.8-1.14.noarch.rpm"
RPM_HASH = "ee714dd8a4185fa23482a8f06d1320089f8595493e757f543f96c9e38f4d1802ad572140fa0ca2270a95a49581e4757e2327537bc5dd55a429c2cd56c77db700"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libnitrokey-udev"

RDEPENDS:${PN} += ""

inherit rpm
