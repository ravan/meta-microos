SUMMARY = "Python Interpreter shared library"
DESCRIPTION = "Python is an interpreted, object-oriented programming language, and is \
often compared to Tcl, Perl, Scheme, or Java.  You can find an overview \
of Python in the documentation and tutorials included in the python-doc \
(HTML) or python-doc-pdf (PDF) packages. \
 \
This package contains libpython3.2 shared library for embedding in \
other applications."
LICENSE = "Python-2.0"

PV = "3.12.14"

RPM_NAME = "libpython3_12-1_0-3.12.14-1.1.aarch64.rpm"
RPM_HASH = "57f5efefe59962c180d084c4b907f12038bdf92c08942cba5c3168d208936fcdcabeefc2c22b4b592525064a8f794c73c52ef6bd449502400296b01c9c6050de"

RPROVIDES:${PN} += "libpython3-12-1-0 \
libpython3.12.so.1.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
python312-base"

inherit rpm
