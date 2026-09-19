SUMMARY = "Development files for the ykpers library"
DESCRIPTION = "Yubico's YubiKey can be re-programmed. This project provides a reference implementation for configuration of YubiKeys."
LICENSE = "BSD-2-Clause"

PV = "1.20.0"

RPM_NAME = "libykpers-devel-1.20.0-3.18.aarch64.rpm"
RPM_HASH = "373bcdacffe320770c7e49ce0cb84a0ff8909e101cb5e99c97891e2b16894b999090db150c48cc67d61a16af6ab6b80c52688985831d5e38fcc56df9cca61b61"

RPROVIDES:${PN} += "libykpers-devel \
pkgconfig-ykpers-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libykpers-1-1"

inherit rpm
