SUMMARY = "Documentation for the IPTC Metadata Tag Manipulation Library"
DESCRIPTION = "libiptcdata is a library for parsing, editing, and saving IPTC \
(International Press Telecommunications Council) data. stored within \
multimedia files such as images. \
 \
This subpackage contains the documentation for it."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.5"

RPM_NAME = "libiptcdata-doc-1.0.5-1.20.aarch64.rpm"
RPM_HASH = "68d0dd8ed7a2415fe4f6a99186ace3a569e77606bab7f744b87eb7452d70c38d4757313207621114b432a00211c77a667f957aee511d8f2df98c3a6ae5cca908"

RPROVIDES:${PN} += "libiptcdata-doc"

RDEPENDS:${PN} += ""

inherit rpm
