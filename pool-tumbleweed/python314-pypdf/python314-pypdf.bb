SUMMARY = "PDF toolkit"
DESCRIPTION = "A Pure-Python library built as a PDF toolkit.  It is capable of: \
 \
- extracting document information (title, author, ...), \
- splitting documents page by page, \
- merging documents page by page, \
- cropping pages, \
- merging multiple pages into a single page, \
- encrypting and decrypting PDF files. \
 \
By being Pure-Python, it should run on any Python platform without any \
dependencies on external libraries.  It can also work entirely on StringIO \
objects rather than file streams, allowing for PDF manipulation in memory. \
It is therefore a useful tool for websites that manage or manipulate PDFs."
LICENSE = "BSD-3-Clause"

PV = "6.16.2"

RPM_NAME = "python314-pypdf-6.16.2-3.1.noarch.rpm"
RPM_HASH = "8a090d41af65cf09b35903289022ec97c474695c42a27b5aee761f94ef8d9aa7cba9c3ae816873e9c771fe2d5979d8dcbef6a4371d70594885e81a33609d764b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyPDF2 \
python3.14dist-pypdf \
python314-pypdf \
python3dist-pypdf"

RDEPENDS:${PN} += "python-abi"

inherit rpm
