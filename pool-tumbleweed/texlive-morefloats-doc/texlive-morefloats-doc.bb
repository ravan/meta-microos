SUMMARY = "Documentation for texlive-morefloats"
DESCRIPTION = "This package includes the documentation for texlive-morefloats"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1asvn77682"

RPM_NAME = "texlive-morefloats-doc-2026.226.1.1asvn77682-61.2.noarch.rpm"
RPM_HASH = "b80cd114fab9a47b0cb303c3cb24d0124f6ab8d167d43f6c3785153e336bfe16d23bd8ea2b253cb503771fd19c2e2882815cbdea63b15ce6acf45ac0ee987aa2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-morefloats-doc"

RDEPENDS:${PN} += ""

inherit rpm
