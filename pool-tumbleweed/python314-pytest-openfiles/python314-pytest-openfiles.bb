SUMMARY = "Pytest plugin for detecting inadvertent open file handles"
DESCRIPTION = "This package provides a plugin for the pytest framework that allows \
developers to detect whether any file handles or other file-like objects were \
inadvertently left open at the end of a unit test."
LICENSE = "BSD-3-Clause"

PV = "0.6.0"

RPM_NAME = "python314-pytest-openfiles-0.6.0-1.10.noarch.rpm"
RPM_HASH = "fac2dce1a519312a0e0fcdad6a6dedca01b5735cefa4e13d885a205123f264e3ccbeb4448b0ea15b9ddab61a396c6eeb8fe77cb164744ecef6ba7a5fa9577d37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-openfiles \
python314-pytest-openfiles \
python3dist-pytest-openfiles"

RDEPENDS:${PN} += "python-abi \
python314-psutil \
python314-pytest"

inherit rpm
