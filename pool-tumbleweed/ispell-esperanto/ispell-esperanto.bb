SUMMARY = "Esperanto ispell dictionary"
DESCRIPTION = "This package includes a ready Esperanto dictionary for ispell. A short \
usage description is given in /usr/share/doc/packages/ispell/README of \
the package ispell. The sources for this dictionary are included in \
the package dicts."
LICENSE = "GPL-2.0-or-later"

PV = "1.5"

RPM_NAME = "ispell-esperanto-1.5-426.1.aarch64.rpm"
RPM_HASH = "3ec9bf2704d196f29dbac53b84da70c8a5d69b4b73bd8e806c2d7058961e5f4f95dc8eb175b2d5039d726143ad230655a624efb60c08e3c1df9b092f4b8d913b"

RPROVIDES:${PN} += "iesperan \
ispell-dictionary \
ispell-esperanto"

RDEPENDS:${PN} += ""

inherit rpm
