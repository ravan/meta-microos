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

PV = "3.10.21"

RPM_NAME = "python310-base-3.10.21-1.1.aarch64.rpm"
RPM_HASH = "be7c1005a7de1d9340d0164261c70551efdc92b789ae9b9db99900b597489c83592cfdf76dfb34ac348753ddb9b24ec736bafebfed34a662fdcd213e1b0f1e08"

RPROVIDES:${PN} += "python-abi \
python310-asyncio \
python310-base \
python310-typing \
python310-xml"

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
libpython3-10-1-0 \
libpython3.10.so.1.0 \
libssl.so.3 \
libuuid.so.1 \
libz.so.1"

inherit rpm
