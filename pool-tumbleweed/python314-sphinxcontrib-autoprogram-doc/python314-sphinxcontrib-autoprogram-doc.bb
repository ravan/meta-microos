SUMMARY = "Documentation for sphinxcontrib-autoprogram"
DESCRIPTION = "This package contains the documentation for the package \
python-sphinxcontrib-autoprogram."
LICENSE = "BSD-2-Clause"

PV = "0.1.9"

RPM_NAME = "python314-sphinxcontrib-autoprogram-doc-0.1.9-2.5.noarch.rpm"
RPM_HASH = "a4d501e7bd0a9538886bcf0b433c0734ef467ffd886ac72b172055cd8e594734c299f5917889550535fd72628af2a4a674434954b69cad004e16b2ed74061fb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-sphinxcontrib-autoprogram-doc"

RDEPENDS:${PN} += "python314-Sphinx"

inherit rpm
