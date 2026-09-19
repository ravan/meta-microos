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

PV = "3.15.0~rc2"

RPM_NAME = "python315-base-3.15.0~rc2-1.2.aarch64.rpm"
RPM_HASH = "02da2266628335fb4ebd4c67ce64ceb58f736a0e6a656b734bfd6dd19544500051fdfdfb3794dd43100b493e8fc35df87a3ce87a08afb83ea8dabbd16c890f19"

RPROVIDES:${PN} += "python-abi \
python315-asyncio \
python315-base \
python315-profiling \
python315-typing \
python315-xml"

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
libpython3-15-1-0 \
libpython3.15.so.1.0 \
libssl.so.3 \
libuuid.so.1 \
libz.so.1 \
libzstd.so.1"

inherit rpm
