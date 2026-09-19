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

PV = "3.13.14"

RPM_NAME = "python313-base-3.13.14-2.1.aarch64.rpm"
RPM_HASH = "a94094c6fb13f2793da50010ade5b0e06832b97ff9d194ba58663333773f86996a6d32586b8e5525e7814615b0bd1671248224edefe8442204b0c78b8fa1db28"

RPROVIDES:${PN} += "python-abi \
python3-asyncio \
python3-base \
python3-typing \
python3-xml \
python313-asyncio \
python313-base \
python313-typing \
python313-xml \
rpm-macro-cpython3-soabi \
rpm-macro-have-python3 \
rpm-macro-py3-compile \
rpm-macro-py3-soflags"

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
libpython3-13-1-0 \
libpython3.13.so.1.0 \
libssl.so.3 \
libuuid.so.1 \
libz.so.1"

inherit rpm
