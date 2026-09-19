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

PV = "3.14.7"

RPM_NAME = "python314-base-3.14.7-1.3.aarch64.rpm"
RPM_HASH = "515910f4b20a3f12a82ea69a7b8bd6a92d6bc49a227b0aceaa95d57677b17c2bedebe26c007c7313020a54d1eb0cf96185aa2a1b7f3590551b78573e2556e8c9"

RPROVIDES:${PN} += "python-abi \
python314-asyncio \
python314-base \
python314-typing \
python314-xml"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libcrypto.so.3 \
libexpat.so.1 \
libffi.so.8 \
liblzma.so.5 \
libm.so.6 \
libmpdec.so.4 \
libpython3-14-1-0 \
libpython3.14.so.1.0 \
libssl.so.3 \
libuuid.so.1 \
libz.so.1 \
libzstd.so.1"

inherit rpm
