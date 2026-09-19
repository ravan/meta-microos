SUMMARY = "Polish ispell dictionary"
DESCRIPTION = "This package includes a ready Polish dictionary for ispell. A short \
usage description is given in /usr/share/doc/packages/ispell/README of \
the package ispell. The sources for this dictionary are included in \
the package dicts."
LICENSE = "CC-BY-SA-1.0 & GPL-2.0-only & LGPL-2.1-only & MPL-1.1"

PV = "1.5"

RPM_NAME = "ispell-polish-1.5-426.1.aarch64.rpm"
RPM_HASH = "5642eaf1abe517116564283e70dcce54ede715ea4aa278baa1837cff8993f3b42296802407455920ae2fafb13225d7df114c0e8eeb32621df839361137d1ef30"

RPROVIDES:${PN} += "ipolish \
ispell-dictionary \
ispell-polish \
locale-ispell-pl"

RDEPENDS:${PN} += ""

inherit rpm
