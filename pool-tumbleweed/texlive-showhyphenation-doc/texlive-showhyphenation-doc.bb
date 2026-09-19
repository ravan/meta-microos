SUMMARY = "Documentation for texlive-showhyphenation"
DESCRIPTION = "This package includes the documentation for texlive-showhyphenation"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn77682"

RPM_NAME = "texlive-showhyphenation-doc-2026.226.0.0.3svn77682-60.2.noarch.rpm"
RPM_HASH = "1fd1b604b62a3de389ce00235e48b77cf450ef70a3e63e66686f1f4b8b74453a91b1b86ac3d952e912d5178de38bf19b8c6c15a35974473078bd8f912fc301f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-showhyphenation-doc"

RDEPENDS:${PN} += ""

inherit rpm
