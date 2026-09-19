SUMMARY = "Python interface to libgphoto2"
DESCRIPTION = "Python bindings to libgphoto2. The module is built using SWIG to \
automatically generate the interface code. This gives direct \
access to nearly all of the libgphoto2 functions, although sometimes \
in a nonstandard manner."
LICENSE = "LGPL-3.0-or-later"

PV = "2.5.1"

RPM_NAME = "python314-gphoto2-2.5.1-1.9.aarch64.rpm"
RPM_HASH = "cf63635f55ca644d5f69f42494cdec9cf5fec48fb315194048fb3453841608256bbb4d6bf6fe472079471a9bd33335d9ff4f2b36226ec5dff9a66fe6ceab9f45"

RPROVIDES:${PN} += "python3.14dist-gphoto2 \
python314-gphoto2 \
python3dist-gphoto2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgphoto2-port.so.12 \
libgphoto2.so.6 \
python-abi"

inherit rpm
