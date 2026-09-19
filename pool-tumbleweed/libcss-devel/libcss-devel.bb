SUMMARY = "Development files for libcss"
DESCRIPTION = "The libcss-devel package contains libraries and header files for \
developing applications that use libcss."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "libcss-devel-0.9.2-2.1.aarch64.rpm"
RPM_HASH = "9270cf819c75313b8b8203e418660e9580584a0b6131951a28bbb94f80b350f8c5b001da9b721febff958fbaec9820293cb6df8bc7e9cc4cc002c498fb62ef99"

RPROVIDES:${PN} += "libcss-devel \
pkgconfig-libcss"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcss0 \
pkgconfig-libparserutils \
pkgconfig-libwapcaplet"

inherit rpm
