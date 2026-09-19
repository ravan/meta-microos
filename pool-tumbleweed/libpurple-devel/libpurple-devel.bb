SUMMARY = "Development Headers, Documentation, and Libraries for libpurple"
DESCRIPTION = "The libpurple-devel package contains the header files, developer \
documentation, and libraries required for development of libpurple \
based instant messaging clients or plugins for any libpurple based \
client."
LICENSE = "GPL-2.0-only"

PV = "2.14.14"

RPM_NAME = "libpurple-devel-2.14.14-2.3.aarch64.rpm"
RPM_HASH = "bf6eb418809d839a2d7f948611bae962bd3a8f37f9b4eabba3f438d720cdb0e7dac8ff30c81947f0b91b91710350b2ec1571a46df6b34f22b4edbf92ef5900e2"

RPROVIDES:${PN} += "libpurple-devel \
pkgconfig-purple"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpurple \
pkgconfig-glib-2.0 \
pkgconfig-libxml-2.0"

inherit rpm
