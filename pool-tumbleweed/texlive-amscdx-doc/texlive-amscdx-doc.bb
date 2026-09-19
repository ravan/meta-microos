SUMMARY = "Documentation for texlive-amscdx"
DESCRIPTION = "This package includes the documentation for texlive-amscdx"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2xsvn77682"

RPM_NAME = "texlive-amscdx-doc-2026.226.2.2xsvn77682-61.2.noarch.rpm"
RPM_HASH = "954fb785f2c2021eb8ed71a5ceba87f5634ebfe758480674970677b6e8c145892b598b7678742d9c370ba87eed6688425abb08d092031df403bc92bee44a6c9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-amscdx-doc"

RDEPENDS:${PN} += ""

inherit rpm
