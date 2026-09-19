SUMMARY = "Documentation for metslib"
DESCRIPTION = "The metslib-doc package provides documentation for the metslib library."
LICENSE = "CPL-1.0 | GPL-3.0-or-later"

PV = "0.5.3"

RPM_NAME = "metslib-doc-0.5.3-3.8.noarch.rpm"
RPM_HASH = "05e07655a77bbf6fd9cc56122e0fed5892ca0ac94fcae9164c25bbe6522ef01c535f090ba789b366d8a97f2602b403894a76f8a508de5bba3a5ebfa842af2716"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metslib-doc"

RDEPENDS:${PN} += ""

inherit rpm
