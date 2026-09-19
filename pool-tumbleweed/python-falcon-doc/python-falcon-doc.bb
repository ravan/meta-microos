SUMMARY = "Documentation files for python-falcon"
DESCRIPTION = "HTML documentation including API documentation and changelog for python-falcon."
LICENSE = "Apache-2.0"

PV = "4.3.1"

RPM_NAME = "python-falcon-doc-4.3.1-1.1.noarch.rpm"
RPM_HASH = "d8939d13b5ecccdfdc2d1cc3c384b4090242fa81afc4152d9535e743d3a69cfdb47e51b28af38b0840279039e282345bf4c7789b3022ffb6f410be7b86ca85f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-falcon-doc \
python313-falcon-doc \
python314-falcon-doc"

RDEPENDS:${PN} += ""

inherit rpm
