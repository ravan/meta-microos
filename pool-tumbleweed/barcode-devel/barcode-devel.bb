SUMMARY = "Text-Mode Barcode Creation Utility - Development files"
DESCRIPTION = "GNU Barcode is meant to meet most barcode creation needs with a \
conventional printer. It can create printouts for the conventional \
product tagging standards: UPC-A, UPC-E, EAN-13, EAN-8, ISBN, as well \
as a few other formats. Output is generated in either PostScript or \
Encapsulated PostScript format."
LICENSE = "GPL-3.0-or-later"

PV = "0.99"

RPM_NAME = "barcode-devel-0.99-12.6.aarch64.rpm"
RPM_HASH = "80939261d640126ff35384493375be62f66dcc242a1a279bfc01fc9bede70abac3a2f0d151126caf7d7ee3d62041b3650ac356632ab0d2ceebfc9245594f35d5"

RPROVIDES:${PN} += "barcode-devel"

RDEPENDS:${PN} += ""

inherit rpm
