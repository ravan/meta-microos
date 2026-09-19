SUMMARY = "Check whether a package name is available on PyPI"
DESCRIPTION = "Check whether a package name is available on PyPI"
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "python314-pname-1.0.2-2.5.noarch.rpm"
RPM_HASH = "10d8890265a8567b129e2eca6579c7c2f8f92ce0a1c7dc864f5c0ba6dc21e795f19ad740a3d1e642d5c44ae58e1555d536b99866d6341c89757415d758d8f9c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pname \
python314-pname \
python3dist-pname"

RDEPENDS:${PN} += "python-abi"

inherit rpm
