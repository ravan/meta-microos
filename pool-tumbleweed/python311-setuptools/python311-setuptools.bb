SUMMARY = "Download, build, install, upgrade, and uninstall Python packages"
DESCRIPTION = "setuptools is a collection of enhancements to the Python distutils that \
allow you to build and distribute Python packages, \
especially ones that have dependencies on other packages."
LICENSE = "Apache-2.0 & MIT & BSD-2-Clause & Python-2.0"

PV = "80.9.0"

RPM_NAME = "python311-setuptools-80.9.0-3.3.noarch.rpm"
RPM_HASH = "aaf3d0e776bb99da0f65f9d7e6c2d9f176d9e4536871aa2aebdf9a5af30c273cef1300b7229f0d49679c0627efa03127adb2f89176e74a07def2db47599e8c94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-setuptools \
python311-setuptools \
python3dist-setuptools"

RDEPENDS:${PN} += "python-abi"

inherit rpm
