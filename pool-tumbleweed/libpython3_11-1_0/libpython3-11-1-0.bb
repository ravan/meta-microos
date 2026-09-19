SUMMARY = "Python Interpreter shared library"
DESCRIPTION = "Python is an interpreted, object-oriented programming language, and is \
often compared to Tcl, Perl, Scheme, or Java.  You can find an overview \
of Python in the documentation and tutorials included in the python-doc \
(HTML) or python-doc-pdf (PDF) packages. \
 \
This package contains libpython3.2 shared library for embedding in \
other applications."
LICENSE = "Python-2.0"

PV = "3.11.16"

RPM_NAME = "libpython3_11-1_0-3.11.16-1.1.aarch64.rpm"
RPM_HASH = "e1b5fce867f17264b3081e324de5df609b68828c088ee49b17021e3aec15694cbfd988ff04b044b86f70bce095ae75f5b7839b9a713f0565b72a41a72ee8640e"

RPROVIDES:${PN} += "libpython3-11-1-0 \
libpython3.11.so.1.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
python311-base"

inherit rpm
