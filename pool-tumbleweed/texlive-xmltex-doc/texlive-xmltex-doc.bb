SUMMARY = "Documentation for texlive-xmltex"
DESCRIPTION = "This package includes the documentation for texlive-xmltex"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.8svn76924"

RPM_NAME = "texlive-xmltex-doc-2026.226.0.0.8svn76924-59.4.noarch.rpm"
RPM_HASH = "f1ee685bfa0e9a2a0dd885c174461b7a36ad2b83d7943c61bdb509f7d4f8f13671a992b58fd203b48b214460d4a0db80d8c2c67721d81fe0cb5c0cb0452f66c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xmltex-doc"

RDEPENDS:${PN} += ""

inherit rpm
