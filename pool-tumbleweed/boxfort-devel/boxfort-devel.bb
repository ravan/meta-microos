SUMMARY = "Development files for boxfort"
DESCRIPTION = "Development files for boxfort."
LICENSE = "MIT"

PV = "0.1.8"

RPM_NAME = "boxfort-devel-0.1.8-1.1.aarch64.rpm"
RPM_HASH = "a2c37260f6773803bd80568fd4319f816c6eacc36ae8045a365e88182b66e3e6d11e34cfcc4a15030d189de9ba0d9c218bf6b75c335609a377a13e0314e88df9"

RPROVIDES:${PN} += "boxfort-devel \
pkgconfig-boxfort"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
boxfort"

inherit rpm
