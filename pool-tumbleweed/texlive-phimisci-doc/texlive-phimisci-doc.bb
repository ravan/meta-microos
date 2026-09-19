SUMMARY = "Documentation for texlive-phimisci"
DESCRIPTION = "This package includes the documentation for texlive-phimisci"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.2svn76924"

RPM_NAME = "texlive-phimisci-doc-2026.226.1.0.2svn76924-58.2.noarch.rpm"
RPM_HASH = "38358bf9e81d4e152bbe2bcbaacb5016f470ec9f31cf2ae87a6f8b598e29569531871f1145ee01781990c46a53e4b4f98826dc4b7f9c68ee46a576e2445b1d68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-phimisci-doc"

RDEPENDS:${PN} += ""

inherit rpm
