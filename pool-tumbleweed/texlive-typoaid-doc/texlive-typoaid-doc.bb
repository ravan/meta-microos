SUMMARY = "Documentation for texlive-typoaid"
DESCRIPTION = "This package includes the documentation for texlive-typoaid"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4.7svn44238"

RPM_NAME = "texlive-typoaid-doc-2026.226.0.0.4.7svn44238-59.2.noarch.rpm"
RPM_HASH = "5c99f105c01fd9d5fdd67e821c762672c1a3900429ffbc1d98d7146ce158d067c151d6c0375b269250139fd7fc26151cba5194ca901212ad3d80302d9a5e668b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-typoaid-doc"

RDEPENDS:${PN} += ""

inherit rpm
