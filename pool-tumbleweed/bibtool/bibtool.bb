SUMMARY = "Tool for Manipulating BibTeX Databases"
DESCRIPTION = "BibTool is a tool for manipulating BibTeX databases. BibTeX provides a means to \
integrate citations into LaTeX documents. BibTool allows the manipulation of \
BibTeX files which goes beyond the possibilities - and intentions - of BibTeX."
LICENSE = "CC-BY-SA-3.0 & GPL-1.0-or-later"

PV = "2.68"

RPM_NAME = "bibtool-2.68-4.3.aarch64.rpm"
RPM_HASH = "e27c1b0529886e748d7ded0f77a5c8307ef35982017c355b4440f091ea05abb47aa8567bd1dc41fedff8825fc607993564ff5061f63c16c2feb4b1cba453a99e"

RPROVIDES:${PN} += "bibtool \
bibtool-doc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
