SUMMARY = "Documentation for texlive-iran-bibtex"
DESCRIPTION = "This package includes the documentation for texlive-iran-bibtex"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4.3svn76790"

RPM_NAME = "texlive-iran-bibtex-doc-2026.226.0.0.4.3svn76790-63.2.noarch.rpm"
RPM_HASH = "ce41b6abb0cb56f31101b11f802d925c29d1f497bc3d2e47b2693b03daa25f542c6e4e47b981e7bb0b8a4ffd6de7ad011f3b9a5add99d6bbab7e5402fac3f872"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-iran-bibtex-doc-fa \
texlive-iran-bibtex-doc"

RDEPENDS:${PN} += ""

inherit rpm
