SUMMARY = "Documentation for texlive-bookest"
DESCRIPTION = "This package includes the documentation for texlive-bookest"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn15878"

RPM_NAME = "texlive-bookest-doc-2026.226.1.1svn15878-59.2.noarch.rpm"
RPM_HASH = "c7b42e4e506eeb3c83bd169adfaed56cb14780247bfa4b7c3564fa4579ecaa90da7fdd83afea2bf1b679a632f55cdeee9519328273e6bd245b428228015a117d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-bookest-doc-en;it \
texlive-bookest-doc"

RDEPENDS:${PN} += ""

inherit rpm
