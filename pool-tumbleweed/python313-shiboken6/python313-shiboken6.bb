SUMMARY = "Python bindings for Qt 6"
DESCRIPTION = "Python bindings for the Qt cross-platform application and UI framework."
LICENSE = "(GPL-2.0-only & (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-with-Qt-GPL-exception-1.0) | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "python313-shiboken6-6.11.2-1.2.aarch64.rpm"
RPM_HASH = "f8f26781ef6911ec69283e4ba85024f4e5c56b0ca88e0c71f123c23f39a36c3ea0f10d138d92e32841f9f5827bf94018a10c8d46154dbb5685189e4c18832b48"

RPROVIDES:${PN} += "libshiboken6.abi3.so.6.11 \
python3-shiboken6 \
python3.13dist-shiboken6 \
python3.13dist-shiboken6-generator \
python313-shiboken6 \
python3dist-shiboken6 \
python3dist-shiboken6-generator"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/python3.13 \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libclang.so.13 \
libgcc-s.so.1 \
libpython3.13.so.1.0 \
libstdc++.so.6 \
libxml2.so.16 \
libxslt.so.1 \
python-abi"

inherit rpm
