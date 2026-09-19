SUMMARY = "Python Interpreter shared library"
DESCRIPTION = "Python is an interpreted, object-oriented programming language, and is \
often compared to Tcl, Perl, Scheme, or Java.  You can find an overview \
of Python in the documentation and tutorials included in the python-doc \
(HTML) or python-doc-pdf (PDF) packages. \
 \
This package contains libpython3.2 shared library for embedding in \
other applications."
LICENSE = "Python-2.0"

PV = "3.13.14"

RPM_NAME = "libpython3_13-1_0-3.13.14-2.1.aarch64.rpm"
RPM_HASH = "9a8f8a22d5ae22604566749f3d8237c6a95501e2a494c0154705d01b325d7134ae053cd0efb6dd7f788971900e16476d3d575e104331d6b226ed2eba4fbc814a"

RPROVIDES:${PN} += "libpython3-13-1-0 \
libpython3.13.so.1.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
python313-base"

inherit rpm
