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

RPM_NAME = "python314-python-poppler-0.4.1-1.9.aarch64.rpm"
RPM_HASH = "4f94a6903912d79e8d07e4f88afc0f1d81573ddff2c950ff8bc8c44a25e676572f048fe8c321718d8326b460cee8085477612d5363853fe7d4b29359180420ce"

RPROVIDES:${PN} += "python3.14dist-python-poppler \
python314-python-poppler \
python3dist-python-poppler"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpoppler-cpp.so.3 \
libstdc++.so.6 \
python-abi"

inherit rpm
