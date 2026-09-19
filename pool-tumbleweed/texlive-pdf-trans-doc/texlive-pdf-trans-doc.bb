SUMMARY = "Documentation for texlive-pdf-trans"
DESCRIPTION = "This package includes the documentation for texlive-pdf-trans"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.2.4svn32809"

RPM_NAME = "texlive-pdf-trans-doc-2026.226.2.4svn32809-58.2.noarch.rpm"
RPM_HASH = "a6e49bbd94dc4297146734894f2f2df4b7ca87987e20d9175e438c793517abad76645bcb9c5f06cfec5097cef29ce5d9d24736a89f9ff8ff8f8f2fc0245b7602"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdf-trans-doc"

RDEPENDS:${PN} += ""

inherit rpm
