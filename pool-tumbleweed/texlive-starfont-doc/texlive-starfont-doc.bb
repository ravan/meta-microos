SUMMARY = "Documentation for texlive-starfont"
DESCRIPTION = "This package includes the documentation for texlive-starfont"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.2svn19982"

RPM_NAME = "texlive-starfont-doc-2026.226.1.2svn19982-64.2.noarch.rpm"
RPM_HASH = "39adef2c5220e5c2c6995a1ea4b7a0cea07c50d09b4a98afa19594c85e8c870cc274571c815bbc30fdee7cea5901d9dce01dad9df793479a8350e9849d2bc6dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-starfont-doc"

RDEPENDS:${PN} += ""

inherit rpm
