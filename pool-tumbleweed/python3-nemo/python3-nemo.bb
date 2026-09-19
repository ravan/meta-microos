SUMMARY = "Python bindings for the Nemo File manager"
DESCRIPTION = "Provides:       python-nemo-devel = 6.4.0 \
Includes Python bindings for the Nemo Filemanager."
LICENSE = "GPL-2.0-only"

PV = "6.4.0"

RPM_NAME = "python3-nemo-6.4.0-6.4.aarch64.rpm"
RPM_HASH = "e8f865d2e356859ae852da17a9c454b0215d4ec5c261ecf08055beb0eb06634f24540f2244308e60e1f2520e9f0d794773bfe1a78dc4ab00537848798ef49413"

RPROVIDES:${PN} += "libnemo-python.so \
nemo-python \
pkgconfig-nemo-python \
python-nemo \
python2-nemo \
python3-nemo \
python3-nemo-devel"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libnemo-extension.so.1 \
libpython3.13.so.1.0 \
nemo"

inherit rpm
