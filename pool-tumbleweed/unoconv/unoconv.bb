SUMMARY = "Tool to convert between any document format supported by LibreOffice"
DESCRIPTION = "unoconv converts between any document format that LibreOffice understands. \
It uses LibreOffice's UNO bindings for non-interactive conversion of \
documents. \
 \
Supported document formats include: Open Document Text (.odt), \
Open Document Draw (.odd), Open Document Presentation (.odp), \
Open Document calc (.odc), MS Word (.doc), MS PowerPoint (.pps/.ppt), \
MS Excel (.xls), MS Office Open/OOXML (.xml), \
Portable Document Format (.pdf), DocBook (.xml), LaTeX (.ltx), \
HTML, XHTML, RTF, Docbook (.xml), GIF, PNG, JPG, SVG, BMP, EPS \
and many more..."
LICENSE = "GPL-2.0-only"

PV = "0.9.0"

RPM_NAME = "unoconv-0.9.0-1.18.noarch.rpm"
RPM_HASH = "762e7475d5bbf23f02e0c72fdccf8efc3aaadf7e3a4e430c1dc70f558beb129b1897bd456ca26029fce6bdf85a539a3d50d6c72f6ec75df8d09efa0e45f89aad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "unoconv"

RDEPENDS:${PN} += "/usr/bin/python3 \
libreoffice-pyuno \
python3"

inherit rpm
