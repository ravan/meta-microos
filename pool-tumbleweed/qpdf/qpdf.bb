SUMMARY = "Command-line tools and library for transforming PDF files"
DESCRIPTION = "QPDF is a program that does structural, content-preserving \
transformations on PDF files.  It could have been called something \
like pdf-to-pdf.  It also provides many useful capabilities to \
developers of PDF-producing software or for people who just want to \
look at the innards of a PDF file to learn more about how they work. \
 \
QPDF offers many capabilities such as linearization (web \
optimization), encrypt, and decryption of PDF files.  Note that QPDF \
does not have the capability to create PDF files from scratch; it is \
only used to create PDF files with special characteristics starting \
from other PDF files or to inspect or extract information from \
existing PDF files."
LICENSE = "Apache-2.0"

PV = "12.4.1"

RPM_NAME = "qpdf-12.4.1-1.1.aarch64.rpm"
RPM_HASH = "4f853830a50fa4c7e48249cefba473e2c26a4e35de47156d7d7640ead0e02f68b7d7f43f3337b0f2157bbcd5a83677397deefb4a566c1f50d848b07a6e38cc9d"

RPROVIDES:${PN} += "qpdf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libqpdf.so.30 \
libstdc++.so.6"

inherit rpm
