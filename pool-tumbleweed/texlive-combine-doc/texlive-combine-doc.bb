SUMMARY = "Documentation for texlive-combine"
DESCRIPTION = "This package includes the documentation for texlive-combine"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.7asvn19361"

RPM_NAME = "texlive-combine-doc-2026.226.0.0.7asvn19361-60.2.noarch.rpm"
RPM_HASH = "0df24e904ce952d39fdc2306863bc8a34d050b962e632581ff8a9e961e3ed4a08717521a97018dd01ac97cad957e7daec794b2a39518e40dff9b51e252f27867"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-combine-doc"

RDEPENDS:${PN} += ""

inherit rpm
