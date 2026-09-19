SUMMARY = "Disassembler, object dumper and hex editor"
DESCRIPTION = "The HT editor is a file viewer, editor and analyzer for text, binary, \
and (especially) executable files. \
 \
This subpackage provides the program under its original name, 'ht', \
though texlive's tex4ht utility clashes with it, which is why the \
real program is in the 'hte' subpackage."
LICENSE = "GPL-2.0-only"

PV = "2.1.0"

RPM_NAME = "ht-2.1.0-4.6.aarch64.rpm"
RPM_HASH = "05a4cf077b310664221c88b9baa099a3d719863047f886d348df67a515a536fea4971e3d2611dd70e00ff78d9a43132fafe82bb875686f6793da607493d6d796"

RPROVIDES:${PN} += "ht"

RDEPENDS:${PN} += "hte"

inherit rpm
