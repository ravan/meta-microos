SUMMARY = "Documentation for texlive-numname"
DESCRIPTION = "This package includes the documentation for texlive-numname"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn18130"

RPM_NAME = "texlive-numname-doc-2026.226.svn18130-61.2.noarch.rpm"
RPM_HASH = "bcb38f8e3e8a50e2cbcd5d65c73d6403ebd8a46bc578fd05d2680c18b99f35fdbaa078e30e9a49c517859973878c41a89e03e3d5b6165d893bb7513a399346a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-numname-doc"

RDEPENDS:${PN} += ""

inherit rpm
