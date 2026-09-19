SUMMARY = "Python Interpreter shared library"
DESCRIPTION = "Python is an interpreted, object-oriented programming language, and is \
often compared to Tcl, Perl, Scheme, or Java.  You can find an overview \
of Python in the documentation and tutorials included in the python-doc \
(HTML) or python-doc-pdf (PDF) packages. \
 \
This package contains libpython3.2 shared library for embedding in \
other applications."
LICENSE = "Python-2.0"

PV = "3.10.21"

RPM_NAME = "libpython3_10-1_0-3.10.21-1.1.aarch64.rpm"
RPM_HASH = "db50d67b87f050f86a7b84bab3c4e783ff6797295f0a36a01619467f195682261f04205be811fa471d8d067540aa7966c07417794c28bc27c80234237bb4c576"

RPROVIDES:${PN} += "libpython3-10-1-0 \
libpython3.10.so.1.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
python310-base"

inherit rpm
