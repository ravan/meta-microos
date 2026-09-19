SUMMARY = "GAP: An interface to Singular"
DESCRIPTION = "The singular package provides an interface from GAP to the \
computer algebra system Singular."
LICENSE = "GPL-2.0-or-later"

PV = "2026.05.05"

RPM_NAME = "gap-singular-2026.05.05-1.2.noarch.rpm"
RPM_HASH = "58a33ca7ff94c87efa9f29cbd2786b539ffc68fc9bbe4708034f650c15032c7f48c45e544de32e73cf52f52a3009208a7eca4b9eece6ee1a744c58a3b75ce9da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-singular"

RDEPENDS:${PN} += "gap-core"

inherit rpm
