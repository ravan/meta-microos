SUMMARY = "Python Interpreter shared library"
DESCRIPTION = "Python is an interpreted, object-oriented programming language, and is \
often compared to Tcl, Perl, Scheme, or Java.  You can find an overview \
of Python in the documentation and tutorials included in the python-doc \
(HTML) or python-doc-pdf (PDF) packages. \
 \
This package contains libpython3.2 shared library for embedding in \
other applications."
LICENSE = "Python-2.0"

PV = "3.14.7"

RPM_NAME = "libpython3_14-1_0-3.14.7-1.3.aarch64.rpm"
RPM_HASH = "248a14a05ad84d30eeb747b1d77bc4b7b1c3d6cf1aa578f52f1e81a8e8e6df3dffd7f65cb224bb29e152194f8936eea9d80d6203d7e0eda9c232922d25a97d01"

RPROVIDES:${PN} += "libpython3-14-1-0 \
libpython3.14.so.1.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
python314-base"

inherit rpm
