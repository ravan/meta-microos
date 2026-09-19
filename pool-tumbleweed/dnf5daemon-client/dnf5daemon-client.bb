SUMMARY = "Command-line interface for dnf5daemon-server"
DESCRIPTION = "Command-line interface for dnf5daemon-server."
LICENSE = "GPL-2.0-or-later"

PV = "5.4.2.1"

RPM_NAME = "dnf5daemon-client-5.4.2.1-1.3.aarch64.rpm"
RPM_HASH = "91258b47ae6c37bb62184a14a1c7c5138fcb8bbf248a210103f25335e1290607657fccf64e8d7c92090fc55dcf032aad5543b9d65929236d598ea17cf24d076b"

RPROVIDES:${PN} += "dnf5daemon-client"

RDEPENDS:${PN} += "dnf5daemon-server \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdnf5-2 \
libdnf5-cli.so.3 \
libdnf5-cli3 \
libdnf5.so.2 \
libfmt.so.12 \
libgcc-s.so.1 \
libjson-c.so.5 \
libsdbus-c++.so.2 \
libstdc++.so.6"

inherit rpm
