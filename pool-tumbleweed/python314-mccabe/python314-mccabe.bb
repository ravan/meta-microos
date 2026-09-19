SUMMARY = "McCabe checker, plugin for flake8"
DESCRIPTION = "Ned's script to check McCabe complexity. \
This module provides a plugin for flake8, the Python code checker."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python314-mccabe-0.7.0-3.5.noarch.rpm"
RPM_HASH = "c649019e1d3e89b423e5886da33446f35d40f8775492c5747674d50c1f0261a7b7d820d08b7932109de60ee4fe5d08672c2bfec211c50cfb16998e1d21daa73b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-mccabe \
python314-mccabe \
python3dist-mccabe"

RDEPENDS:${PN} += "python-abi"

inherit rpm
