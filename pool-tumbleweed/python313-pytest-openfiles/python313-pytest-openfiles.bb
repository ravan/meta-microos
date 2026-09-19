SUMMARY = "Pytest plugin for detecting inadvertent open file handles"
DESCRIPTION = "This package provides a plugin for the pytest framework that allows \
developers to detect whether any file handles or other file-like objects were \
inadvertently left open at the end of a unit test."
LICENSE = "BSD-3-Clause"

PV = "0.6.0"

RPM_NAME = "python313-pytest-openfiles-0.6.0-1.10.noarch.rpm"
RPM_HASH = "10f5e38fedd13873c0ca9b0c2d167dcd8e720daace84087d79296ff3b5b5955fae0201cd39fbbd9d8dc408105215a6d1caa9b469bbbf837649460f8d43e4d4e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-openfiles \
python3.13dist-pytest-openfiles \
python313-pytest-openfiles \
python3dist-pytest-openfiles"

RDEPENDS:${PN} += "python-abi \
python313-psutil \
python313-pytest"

inherit rpm
