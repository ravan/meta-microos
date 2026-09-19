SUMMARY = "Documentation for texlive-scrlttr2copy"
DESCRIPTION = "This package includes the documentation for texlive-scrlttr2copy"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3asvn56733"

RPM_NAME = "texlive-scrlttr2copy-doc-2026.226.0.0.3asvn56733-60.2.noarch.rpm"
RPM_HASH = "40903b5d4c1d203caa755d93bbf973b86b12e7d0a323df280e4254d2eb1f5a953d81fc69d2a078b6c4c176018eff01983d903f2a4ac69c6836b5cff864e8815a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-scrlttr2copy-doc"

RDEPENDS:${PN} += ""

inherit rpm
