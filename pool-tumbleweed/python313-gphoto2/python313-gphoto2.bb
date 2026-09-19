SUMMARY = "Python interface to libgphoto2"
DESCRIPTION = "Python bindings to libgphoto2. The module is built using SWIG to \
automatically generate the interface code. This gives direct \
access to nearly all of the libgphoto2 functions, although sometimes \
in a nonstandard manner."
LICENSE = "LGPL-3.0-or-later"

PV = "2.5.1"

RPM_NAME = "python313-gphoto2-2.5.1-1.9.aarch64.rpm"
RPM_HASH = "d3ecac6e4b3a6b27e413846428653f762f406f512f119319a968725d9d2bfec83ec07833e8ce91a361e5d889fb3e0920118adec5463b41b7a93542dfcdfd4e2b"

RPROVIDES:${PN} += "python3-gphoto2 \
python3.13dist-gphoto2 \
python313-gphoto2 \
python3dist-gphoto2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgphoto2-port.so.12 \
libgphoto2.so.6 \
python-abi"

inherit rpm
