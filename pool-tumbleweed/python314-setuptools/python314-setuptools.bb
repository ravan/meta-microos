SUMMARY = "Download, build, install, upgrade, and uninstall Python packages"
DESCRIPTION = "setuptools is a collection of enhancements to the Python distutils that \
allow you to build and distribute Python packages, \
especially ones that have dependencies on other packages."
LICENSE = "Apache-2.0 & MIT & BSD-2-Clause & Python-2.0"

PV = "80.9.0"

RPM_NAME = "python314-setuptools-80.9.0-3.3.noarch.rpm"
RPM_HASH = "64149f5a8757f76106e3afd9b77ef0a2e719f5c311e67e6d74de71a87bd76f743ed205beaf9f51411867b1e7e027170331bb3a3a6057a6471f356cd0332cd56b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-setuptools \
python314-setuptools \
python3dist-setuptools"

RDEPENDS:${PN} += "python-abi"

inherit rpm
