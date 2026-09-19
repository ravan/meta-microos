SUMMARY = "Development files for libsystemd and libudev"
DESCRIPTION = "Development headers and files for libsystemd and libudev libraries for \
developing and building applications linking to these libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "261.2"

RPM_NAME = "systemd-mini-devel-261.2-1.1.aarch64.rpm"
RPM_HASH = "8f4bcb74e022f9ab764766113094657e14e532c6c805ad08926455b8ac37e504d8f8f449d510282eddc36ec9aeace0130d9d8eb7ef48a9b5660389452353442e"

RPROVIDES:${PN} += "libudev-devel \
libudev-mini-devel \
pkgconfig-libsystemd \
pkgconfig-libudev \
systemd-devel \
systemd-mini-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsystemd0-mini \
libudev-mini1 \
systemd-rpm-macros"

inherit rpm
