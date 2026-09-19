SUMMARY = "Development files for mimetic"
DESCRIPTION = "This package contains libraries and header files for \
developing applications that use mimetic."
LICENSE = "MIT"

PV = "0.9.8"

RPM_NAME = "libmimetic-devel-0.9.8-4.7.aarch64.rpm"
RPM_HASH = "d81e7cca02c410e59a5643cdc8c437168ad773b390d5c371621655d4b7f5e583daea4cee861e12fbf9145e567ffbb12c019dee707cc7ae90808c1e788a3bfd36"

RPROVIDES:${PN} += "libmimetic-devel"

RDEPENDS:${PN} += "libmimetic0"

inherit rpm
