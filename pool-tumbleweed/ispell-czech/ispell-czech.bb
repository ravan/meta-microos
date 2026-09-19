SUMMARY = "Czech ispell dictionary"
DESCRIPTION = "This package includes a ready Czech dictionary for ispell. A short \
usage description is given in /usr/share/doc/packages/ispell/README of \
the package ispell. The sources for this dictionary are included in \
the package dicts."
LICENSE = "BSD-3-Clause"

PV = "1.5"

RPM_NAME = "ispell-czech-1.5-426.1.aarch64.rpm"
RPM_HASH = "bc320016e683ba197b01ee1455487942b536aba21346edbbbafa3777f247c64f3a4528a8ea99a0e6b4223467afcc39dba3fe4477cea0d70be99de5665ccc8401"

RPROVIDES:${PN} += "iczech \
ispell-czech \
ispell-dictionary \
locale-ispell-cs;sk"

RDEPENDS:${PN} += ""

inherit rpm
