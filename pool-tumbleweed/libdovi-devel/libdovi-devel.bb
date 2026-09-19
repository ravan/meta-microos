SUMMARY = "Development libraries for libdovi"
DESCRIPTION = "The libdovi-devel package contains C header files for \
developing applications that use libdovi."
LICENSE = "MIT"

PV = "3.4.0"

RPM_NAME = "libdovi-devel-3.4.0-1.3.aarch64.rpm"
RPM_HASH = "92dfead111cda02ece9995960e9bd1e6294b4dd852cf794fb63c241c03790c325118c829c7fe29f040dd6fd1047c9e9e6ca9d78a2bf5732004ff861236c5d641"

RPROVIDES:${PN} += "libdovi-devel \
pkgconfig-dovi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdovi3"

inherit rpm
