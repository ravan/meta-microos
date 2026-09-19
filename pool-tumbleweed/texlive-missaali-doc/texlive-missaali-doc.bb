SUMMARY = "Documentation for texlive-missaali"
DESCRIPTION = "This package includes the documentation for texlive-missaali"
LICENSE = "OFL-1.1"

PV = "2026.226.2.0svn61719"

RPM_NAME = "texlive-missaali-doc-2026.226.2.0svn61719-61.2.noarch.rpm"
RPM_HASH = "64b0a77c788d8d730f3b13f07c9940d51631c920a5a559ed9209fb6b5f9685fe36d9a26528624bf753d6f40a3db21c5e245b795eca620cd682248b5ed6303196"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-missaali-doc"

RDEPENDS:${PN} += ""

inherit rpm
