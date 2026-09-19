SUMMARY = "OpenStack Packaging - python module name to package name map"
DESCRIPTION = "pymod2pkg is a simple python module for translating python module names to \
corresponding package names which is a common problem in the packaging world. \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "0.28.0"

RPM_NAME = "python3-pymod2pkg-0.28.0-1.8.noarch.rpm"
RPM_HASH = "d74f764f3a430071ef5e279fc55e39888712adddc9ef1dc52ab340cf354d48b32ae9e6e69e1c81a49b033952db4aa995dfd5b4f7c91609b7e1e81e975559ac1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pymod2pkg \
python3.13dist-pymod2pkg \
python3dist-pymod2pkg"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-distro \
python3-pbr"

inherit rpm
