SUMMARY = "Download, build, install, upgrade, and uninstall Python packages"
DESCRIPTION = "setuptools is a collection of enhancements to the Python distutils that \
allow you to build and distribute Python packages, \
especially ones that have dependencies on other packages."
LICENSE = "Apache-2.0 & MIT & BSD-2-Clause & Python-2.0"

PV = "80.9.0"

RPM_NAME = "python312-setuptools-80.9.0-3.3.noarch.rpm"
RPM_HASH = "c060dfec4138c0ea02721f79fb13c315dec694251e936c8acfa24eff55d09ad7a4ccbd793ad94cb6aaf98b845e78b55605b53a71ac9fa70651b909e4ae5f88b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.12dist-setuptools \
python312-setuptools \
python3dist-setuptools"

RDEPENDS:${PN} += "python-abi"

inherit rpm
