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

PV = "3.11.16"

RPM_NAME = "python311-base-3.11.16-1.1.aarch64.rpm"
RPM_HASH = "465e1a2b24efe717478cc5f7d3332b66e947a8fdb6ecc93be708345318e0bad49b2518a63cd9296b9e40c966fe9f33493251ee94946396c6ed282b8f2631fe7e"

RPROVIDES:${PN} += "python-abi \
python311-asyncio \
python311-base \
python311-typing \
python311-xml"

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
libpython3-11-1-0 \
libpython3.11.so.1.0 \
libssl.so.3 \
libuuid.so.1 \
libz.so.1"

inherit rpm
