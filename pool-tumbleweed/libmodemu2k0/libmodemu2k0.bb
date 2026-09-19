SUMMARY = "Shared library for the modemu2k modem emulator"
DESCRIPTION = "This package contains the shared library for modemu2k."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.4"

RPM_NAME = "libmodemu2k0-0.2.4-1.2.aarch64.rpm"
RPM_HASH = "48f203e7a430582239e5c0bba8917c8ecb93113fc1918bbcedec850d18a6a4a04c3d7a345d0f24403633ebcc90cc7e44ffd0d0f625ec949fe4d75a331d5dd98d"

RPROVIDES:${PN} += "libmodemu2k.so.0 \
libmodemu2k0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
