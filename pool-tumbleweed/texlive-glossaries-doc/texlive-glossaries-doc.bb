SUMMARY = "Documentation for texlive-glossaries"
DESCRIPTION = "This package includes the documentation for texlive-glossaries"
LICENSE = "LPPL-1.0"

PV = "2026.226.4.9svn76800"

RPM_NAME = "texlive-glossaries-doc-2026.226.4.9svn76800-60.4.noarch.rpm"
RPM_HASH = "d3e6d6d9d5458fbbbcb118db796ac7ca369833c2f220603eceb01b3cbc7338ab300d0b806beee4242f3be93b9fde4febc246a0e77d0a87ccb74423f4e88c7e8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-makeglossaries-lite.1 \
man-makeglossaries.1 \
texlive-glossaries-doc"

RDEPENDS:${PN} += ""

inherit rpm
