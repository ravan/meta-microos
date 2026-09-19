SUMMARY = "Documentation for texlive-flacards"
DESCRIPTION = "This package includes the documentation for texlive-flacards"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.1.1bsvn19440"

RPM_NAME = "texlive-flacards-doc-2026.226.0.0.1.1bsvn19440-59.2.noarch.rpm"
RPM_HASH = "5a1714b8a705833f04d6cbd193816a4a510915f880620f1eb71a7cce4d63b165f2238d8563f08a95a4606deaa00af61754c53053a0c6fba5b94fcb4f11851cb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-flacards-doc"

RDEPENDS:${PN} += ""

inherit rpm
