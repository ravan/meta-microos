SUMMARY = "Documentation for texlive-muling"
DESCRIPTION = "This package includes the documentation for texlive-muling"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.5svn66741"

RPM_NAME = "texlive-muling-doc-2026.226.0.0.5svn66741-61.2.noarch.rpm"
RPM_HASH = "a5c1b902d7c592d0b2270f5ed950766fdefe747e327cfec5b3a2ce329d23f0e03e5f4130ba9a9476a24050b73d7447c55f21132152ea11fc0885d518c84a8c6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-muling-doc"

RDEPENDS:${PN} += ""

inherit rpm
