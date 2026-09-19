SUMMARY = "Development files for libreofficekit"
DESCRIPTION = "The libreofficekit-devel package contains libraries and header files for \
developing applications that use libreofficekit."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreofficekit-devel-26.8.0.3-1.1.aarch64.rpm"
RPM_HASH = "4da45c598d27b1cbc42197f5c578b9aaf87de3140382cad22f1da947566d4ee89c0e3fdb9f0970a95809882e9ea28b118283b46fa5ade050f852bdf365518a2b"

RPROVIDES:${PN} += "libreofficekit-devel"

RDEPENDS:${PN} += "libreofficekit"

inherit rpm
