SUMMARY = "Documentation for texlive-crbox"
DESCRIPTION = "This package includes the documentation for texlive-crbox"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn29803"

RPM_NAME = "texlive-crbox-doc-2026.226.0.0.1svn29803-61.2.noarch.rpm"
RPM_HASH = "4d6d1dc941253b3229c2b881c43b64e5e79c1138644316b7be2a88d4d4533418f901487bece3d7e5b4062b761df66147fad4b86b62e51bd32589549e558d158a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-crbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
