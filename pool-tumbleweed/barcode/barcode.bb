SUMMARY = "Text-Mode Barcode Creation Utility"
DESCRIPTION = "GNU Barcode is meant to meet most barcode creation needs with a \
conventional printer. It can create printouts for the conventional \
product tagging standards: UPC-A, UPC-E, EAN-13, EAN-8, ISBN, as well \
as a few other formats. Output is generated in either PostScript or \
Encapsulated PostScript format."
LICENSE = "GPL-3.0-or-later"

PV = "0.99"

RPM_NAME = "barcode-0.99-12.6.aarch64.rpm"
RPM_HASH = "65951fd526bb27c9ce9b0b5ec36a7333005bd99e994184400392be756fbbb8c03ea404b9ed538e292fd2dc95afded6b801ce50339f8557160887c17306d826ef"

RPROVIDES:${PN} += "barcode"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
