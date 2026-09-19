SUMMARY = "The Sphinx theme for the CPython docs and related projects"
DESCRIPTION = "The Sphinx theme for the CPython docs and related projects"
LICENSE = "Python-2.0"

PV = "2026.4"

RPM_NAME = "python314-python-docs-theme-2026.4-1.2.noarch.rpm"
RPM_HASH = "6b4371a3a55d8a4f0eafd8e428b8cea2c6b6b8d8b97bed4363b53122713c6aa4c99e710175347946f7090c27301dc62bfb87065b3504f7702e3fd9ea92a557f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-docs-theme \
python314-python-docs-theme \
python3dist-python-docs-theme"

RDEPENDS:${PN} += "python-abi \
python314-Sphinx"

inherit rpm
