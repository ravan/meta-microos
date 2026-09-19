SUMMARY = "Header and devel files for libfallocate"
DESCRIPTION = "This package contains the header file and the .so library to link \
against for apps that want to use libfallocate."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.1"

RPM_NAME = "libfallocate-devel-0.1.1-17.26.aarch64.rpm"
RPM_HASH = "dde7d3219d11a2507c9c443a87b16c23a2cdeb0f43421fe8581a39230b160eafffab6347c76bf470c7d4b600bb766fdd437ec12bff2d0daea13f536d32574541"

RPROVIDES:${PN} += "libfallocate-devel"

RDEPENDS:${PN} += "libfallocate0"

inherit rpm
