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

RPM_NAME = "python313-pypdf-6.16.2-3.1.noarch.rpm"
RPM_HASH = "261a1c7ae41280bba51c481a9eb77ff5c9c0d5eaaa62fe41a7493367d3eb6b1bf2a855ea74ace8066b9e9cd4355b7fe90ddb6b3853b418ed86ebacd51e168d0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyPDF2 \
python3-pypdf \
python3.13dist-pypdf \
python313-pypdf \
python3dist-pypdf"

RDEPENDS:${PN} += "python-abi"

inherit rpm
