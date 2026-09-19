SUMMARY = "Documentation for texlive-simurgh"
DESCRIPTION = "This package includes the documentation for texlive-simurgh"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.01bsvn31719"

RPM_NAME = "texlive-simurgh-doc-2026.226.0.0.01bsvn31719-64.2.noarch.rpm"
RPM_HASH = "d122d923b228d1b03f41b9bf950f244633b32aad872617fd009f156037e2364e2deed512c082784bdd2148538819c7eb2f2fbea3296af2d13037f0bdd29a9462"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-simurgh-doc"

RDEPENDS:${PN} += ""

inherit rpm
