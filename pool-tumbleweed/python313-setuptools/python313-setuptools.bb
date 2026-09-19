SUMMARY = "Download, build, install, upgrade, and uninstall Python packages"
DESCRIPTION = "setuptools is a collection of enhancements to the Python distutils that \
allow you to build and distribute Python packages, \
especially ones that have dependencies on other packages."
LICENSE = "Apache-2.0 & MIT & BSD-2-Clause & Python-2.0"

PV = "80.9.0"

RPM_NAME = "python313-setuptools-80.9.0-3.2.noarch.rpm"
RPM_HASH = "85a2359fbfbbedab2d5fa583f641d3c8e680d7c5e41d441dcb51722d172f67bd5163290d5f35fbf41d670c190977f97ab44679ca5500f63c0e967a1156a73b1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-setuptools \
python3.13dist-setuptools \
python313-setuptools \
python3dist-setuptools"

RDEPENDS:${PN} += "python-abi"

inherit rpm
