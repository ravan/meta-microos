SUMMARY = "GAP: Automatic typesetting framework for common GAP objects"
DESCRIPTION = "This GAP package implements a framework for automatic typesetting of \
common GAP objects, for the purpose of embedding them nicely into \
research papers. Currently, an example implementation has been \
written specifically for LaTeX."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.4"

RPM_NAME = "gap-typeset-1.2.4-1.2.noarch.rpm"
RPM_HASH = "578e89605b5e61b370376adce35547aebc917176aa9683fa35746dfff08ae4f693617e759e878e17f6d0b96f754fd572488a3c273a6faf37717e9c4618c15439"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-typeset"

RDEPENDS:${PN} += "gap-core"

inherit rpm
