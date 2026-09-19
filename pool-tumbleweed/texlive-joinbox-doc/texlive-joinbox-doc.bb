SUMMARY = "Documentation for texlive-joinbox"
DESCRIPTION = "This package includes the documentation for texlive-joinbox"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.3svn76924"

RPM_NAME = "texlive-joinbox-doc-2026.226.1.0.3svn76924-63.2.noarch.rpm"
RPM_HASH = "d0fee74121eef591b72acd10f52feeabf40839534565d6dde8bf1d456d7e7a470af324e49174111d64adbee593a0e984d9443cdd6a0ab3d4e860dc1f729bf9e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-joinbox-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
