SUMMARY = "Development files for log4c"
DESCRIPTION = "The liblog4c-devel package contains the static libraries and header \
files needed for development with log4c."
LICENSE = "LGPL-2.1+"

PV = "1.2.4"

RPM_NAME = "liblog4c-devel-1.2.4-5.38.aarch64.rpm"
RPM_HASH = "526086187e52898db0ca64d4ef835775a362ccdf51cb867437dd33c677944bfbb0918d2d0ca02f92c0177c9b32d6284e6968c532a8af2af45ae63e61df90875c"

RPROVIDES:${PN} += "liblog4c-devel \
pkgconfig-log4c"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
liblog4c3"

inherit rpm
