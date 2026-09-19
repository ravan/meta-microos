SUMMARY = "Pytest plugin for echoing build environment attributes"
DESCRIPTION = "pytest plugin with mechanisms for echoing environment variables, \
package version and generic attributes."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python313-pytest-echo-2.0.1-1.6.noarch.rpm"
RPM_HASH = "43d12e3ba7dc416157b0345dda0a159188400434a8e9492abfd0a8fc3065a2717593ef2d3f8c2ee49353becba79dda35b59ec6bbb7e1c2a27d3dfd2fe9e8ae39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-echo \
python3.13dist-pytest-echo \
python313-pytest-echo \
python3dist-pytest-echo"

RDEPENDS:${PN} += "python-abi \
python313-pytest"

inherit rpm
