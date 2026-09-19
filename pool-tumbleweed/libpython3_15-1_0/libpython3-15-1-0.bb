SUMMARY = "Python Interpreter shared library"
DESCRIPTION = "Python is an interpreted, object-oriented programming language, and is \
often compared to Tcl, Perl, Scheme, or Java.  You can find an overview \
of Python in the documentation and tutorials included in the python-doc \
(HTML) or python-doc-pdf (PDF) packages. \
 \
This package contains libpython3.2 shared library for embedding in \
other applications."
LICENSE = "Python-2.0"

PV = "3.15.0~rc2"

RPM_NAME = "libpython3_15-1_0-3.15.0~rc2-1.2.aarch64.rpm"
RPM_HASH = "f6200ca01a1cdf9d755f2afe0402079f9582746a667111bf5bd91a8ff17e1c9a52c2747a6fc61c9f391006347484e7b9f82b4a628ad1b2692399630141684716"

RPROVIDES:${PN} += "libpython3-15-1-0 \
libpython3.15.so.1.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
python315-base"

inherit rpm
