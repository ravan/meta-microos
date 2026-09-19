SUMMARY = "Asturian (asturianu) Dictionary for Aspell"
DESCRIPTION = "An Asturian (asturianu) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.01"

RPM_NAME = "aspell-ast-0.01-4.7.aarch64.rpm"
RPM_HASH = "aaefff2fef55e7910295edba622e102ad246d4eb701c9146859e483a218608edd3f2faca847afe92b5f8af69273c33b3feafbf491f4eca7c716bb8a4c6e33290"

RPROVIDES:${PN} += "aspell-ast \
locale-aspell-ast"

RDEPENDS:${PN} += ""

inherit rpm
