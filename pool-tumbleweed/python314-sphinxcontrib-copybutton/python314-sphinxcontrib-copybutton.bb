SUMMARY = "Add a copy button to each of your code cells"
DESCRIPTION = "Add a copy button to each of your code cells."
LICENSE = "MIT"

PV = "0.5.1"

RPM_NAME = "python314-sphinxcontrib-copybutton-0.5.1-3.5.noarch.rpm"
RPM_HASH = "033080e1eff98dc2da10be645ce4fde37f18670fa374927bd9748ce1e206661e22bf4d13d2a11f4f0107c399e7ff510ff525402b693137ddd5e93d87a7e276c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sphinx-copybutton \
python314-sphinxcontrib-copybutton \
python3dist-sphinx-copybutton"

RDEPENDS:${PN} += "python-abi \
python314-Sphinx"

inherit rpm
