SUMMARY = "Sphinx extension that automatically documents click applications"
DESCRIPTION = "A Sphinx plugin that allows to automatically extract documentation from click-based applications and include it in documentation."
LICENSE = "MIT"

PV = "6.2.0"

RPM_NAME = "python313-sphinx-click-6.2.0-1.3.noarch.rpm"
RPM_HASH = "5689d08338f974f70c4e6a31adb2ea5b1fd3583d3ee7fe59351cbf94888484994b23818e44e0dc470ceac23c3bf488162149bb5cb8b7811ae8c19111bee0babe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx-click \
python3.13dist-sphinx-click \
python313-sphinx-click \
python3dist-sphinx-click"

RDEPENDS:${PN} += "python-abi \
python3.13dist-click \
python3.13dist-docutils \
python3.13dist-sphinx"

inherit rpm
