SUMMARY = "Documentation for texlive-fgruler"
DESCRIPTION = "This package includes the documentation for texlive-fgruler"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.7svn77333"

RPM_NAME = "texlive-fgruler-doc-2026.226.1.7svn77333-59.2.noarch.rpm"
RPM_HASH = "20f635365676a6c04d305be2a3d9cd2f3e9e40dd99a7b2955b05dec0b2061cb5b19128a97c264fe56fb22063d4194e23697995eae266b7b058c19f65ae77b08e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fgruler-doc"

RDEPENDS:${PN} += ""

inherit rpm
