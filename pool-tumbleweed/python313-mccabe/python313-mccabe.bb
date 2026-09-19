SUMMARY = "McCabe checker, plugin for flake8"
DESCRIPTION = "Ned's script to check McCabe complexity. \
This module provides a plugin for flake8, the Python code checker."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python313-mccabe-0.7.0-3.5.noarch.rpm"
RPM_HASH = "2dfc4b8490badedf253930b8c1278bd4e151ecbf7e293a40123d3f34f7cb61f66dc78bbebb676cafabb8a58c476b98d36044526279a53df3f1f08b9c531ee3a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mccabe \
python3.13dist-mccabe \
python313-mccabe \
python3dist-mccabe"

RDEPENDS:${PN} += "python-abi"

inherit rpm
