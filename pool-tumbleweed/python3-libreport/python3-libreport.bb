SUMMARY = "Python 3 bindings for report-libs"
DESCRIPTION = "Python 3 bindings for report-libs."
LICENSE = "GPL-2.0-or-later"

PV = "2.17.15"

RPM_NAME = "python3-libreport-2.17.15-1.13.aarch64.rpm"
RPM_HASH = "11d0c583b94b32c3c438eb430ad2c79a3232dce1717bcd3fee387cc9109a10d5d156b84733f842fce2523d1498989562ee30b129e21feda972ecb9ae2ee45002"

RPROVIDES:${PN} += "python3-libreport"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libreport-2 \
libreport.so.2 \
python-abi \
python3-dnf \
python3-requests"

inherit rpm
