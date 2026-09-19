SUMMARY = "Documentation files for kanku"
DESCRIPTION = "This package contains the documentation files for kanku."
LICENSE = "GPL-3.0-only"

PV = "1.0.0"

RPM_NAME = "kanku-doc-1.0.0-2.2.noarch.rpm"
RPM_HASH = "f4c1266d348f7c9638ed22879a703d92278fed29a270e7d021dfd3c5ed913ec42036c4d8a737292fed617f195d784e8f8b4882099a9bbe91c2365ccee89ae1af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kanku-doc"

RDEPENDS:${PN} += ""

inherit rpm
