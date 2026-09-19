SUMMARY = "Tiny Editor with Many Different Modes like Vi, Emacs, and Wordstar"
DESCRIPTION = "A very tiny editor, which offers many different modes like Vi, Emacs, and \
Wordstar. Wordstar is the default mode."
LICENSE = "GPL-2.0+"

PV = "2.82"

RPM_NAME = "e3-2.82-1.25.aarch64.rpm"
RPM_HASH = "2eeaf4e68d5186df7e7979a9c221584b16a8525253ab520f690d4c902cdc687d0efeabb9c31a50e9f58f3493d3888cb8c3a7327ffcd2629c9848e764df6e9698"

RPROVIDES:${PN} += "e3"

RDEPENDS:${PN} += ""

inherit rpm
