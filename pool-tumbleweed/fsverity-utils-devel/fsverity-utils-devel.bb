SUMMARY = "Development package for fsverity-utils"
DESCRIPTION = "Development package for fsverity-utils, including libfsverity header \
and library files."
LICENSE = "MIT"

PV = "1.7"

RPM_NAME = "fsverity-utils-devel-1.7-1.3.aarch64.rpm"
RPM_HASH = "53556155a4ce542267d06ca5792cb6bf83335eacb784f2ddadefac1fcf57dd403f7b59b421a4feb8495bf7a3c0c51d435a2590ee7145f2fe1fe652ac8bd21865"

RPROVIDES:${PN} += "fsverity-utils-devel \
pkgconfig-libfsverity"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfsverity0 \
pkgconfig-libcrypto"

inherit rpm
