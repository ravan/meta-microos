SUMMARY = "Python binding to the poppler-cpp library"
DESCRIPTION = "python-poppler is a Python binding to the poppler-cpp library. It allows to \
read, render, or modify PDF documents. More specifically, it currently allows \
to: \
    read an modify document meta data; \
    list and read embedded documents; \
    list the fonts used by the document; \
    search or extract text on a given page of the document; \
    render a page to a raw image; \
    get info about transitions effects between the pages; \
    read the table of contents of the document."
LICENSE = "GPL-2.0-only"

PV = "0.4.1"

RPM_NAME = "python313-python-poppler-0.4.1-1.9.aarch64.rpm"
RPM_HASH = "d3d7dac6887e671f1a690aa44cd305d743d377c8f0f8b67263545f2ae096946b9b07f7bde4d5ef8d823e0f745ec1c13186669263dcdab613a56997f6ddc7c607"

RPROVIDES:${PN} += "python3-python-poppler \
python3.13dist-python-poppler \
python313-python-poppler \
python3dist-python-poppler"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpoppler-cpp.so.3 \
libstdc++.so.6 \
python-abi"

inherit rpm
