SUMMARY = "Documentation for texlive-ntgclass"
DESCRIPTION = "This package includes the documentation for texlive-ntgclass"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1hsvn77239"

RPM_NAME = "texlive-ntgclass-doc-2026.226.2.1hsvn77239-61.2.noarch.rpm"
RPM_HASH = "363156c45671f676e2c38e5a9bccde8ed518e4423111db5b5eadae3b63c5df68d26fbbebb3a69f10226214dd8aafe1c23057553b4e6c1adaf83408babe1c1959"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-ntgclass-doc-nl \
texlive-ntgclass-doc"

RDEPENDS:${PN} += ""

inherit rpm
