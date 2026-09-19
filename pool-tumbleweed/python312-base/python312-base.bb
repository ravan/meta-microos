SUMMARY = "Python 3 Interpreter and Stdlib Core"
DESCRIPTION = "Python is an interpreted, object-oriented programming language, and is \
often compared to Tcl, Perl, Scheme, or Java.  You can find an overview \
of Python in the documentation and tutorials included in the python-doc \
package. \
 \
This package contains the interpreter core and most commonly used modules \
from the standard library. This is sufficient for many usecases, but it \
excludes components that depend on external libraries, most notably XML, \
database and UI toolkits support."
LICENSE = "Python-2.0"

PV = "3.12.14"

RPM_NAME = "python312-base-3.12.14-1.1.aarch64.rpm"
RPM_HASH = "7ddad1679f69f950f81c3769724430bfd0cd0e60ed92002f6321f3511b7a7f345e3124470c534d244390d067c9193d592d8f708f9dbdc6d9de38762a4dfdc01b"

RPROVIDES:${PN} += "python-abi \
python312-asyncio \
python312-base \
python312-typing \
python312-xml"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libcrypt.so.1 \
libcrypto.so.3 \
libexpat.so.1 \
libffi.so.8 \
liblzma.so.5 \
libm.so.6 \
libmpdec.so.4 \
libpython3-12-1-0 \
libpython3.12.so.1.0 \
libssl.so.3 \
libuuid.so.1 \
libz.so.1"

inherit rpm
