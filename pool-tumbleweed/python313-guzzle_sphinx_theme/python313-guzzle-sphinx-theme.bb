SUMMARY = "Sphinx theme used by Guzzle"
DESCRIPTION = "This package contains the python bindings of the Sphinx theme used by Guzzle."
LICENSE = "MIT & OFL-1.1"

PV = "0.7.11"

RPM_NAME = "python313-guzzle_sphinx_theme-0.7.11-4.5.noarch.rpm"
RPM_HASH = "705805c4db1b9071e82c190128570e4b318f94b41583367282d7359870c0f9479d594523886302a60641481e3c08299f3dc3eedf8a3baba6890ca0304b0caaee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-guzzle-sphinx-theme \
python3.13dist-guzzle-sphinx-theme \
python313-guzzle-sphinx-theme \
python3dist-guzzle-sphinx-theme"

RDEPENDS:${PN} += "python-abi \
python313-Sphinx"

inherit rpm
