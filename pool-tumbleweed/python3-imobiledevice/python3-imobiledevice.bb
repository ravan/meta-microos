SUMMARY = "Python bindings for libimobiledevice"
DESCRIPTION = "Contains Python bindings for developing applications that use libimobiledevice."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.0+0git.20251010"

RPM_NAME = "python3-imobiledevice-1.4.0+0git.20251010-1.6.aarch64.rpm"
RPM_HASH = "ee9d67cbc515de017471919eb50003755138c9d55f4788f27482ab37bcb1e134957248ab96bd6ec335355b1cf9c0cd2048778a73801ae64a5c8e97d9eb35d30a"

RPROVIDES:${PN} += "python3-imobiledevice"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libimobiledevice-1-0-6 \
libimobiledevice-1.0.so.6 \
libplist-2.0.so.4 \
libpython3.13.so.1.0 \
python-abi \
python3-plist"

inherit rpm
