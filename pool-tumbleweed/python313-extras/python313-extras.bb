SUMMARY = "Extra bits for Python"
DESCRIPTION = "extras is a set of extensions to the Python standard library, originally \
written to make the code within testtools cleaner, but now split out for \
general use outside of a testing context."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python313-extras-1.0.0-8.3.noarch.rpm"
RPM_HASH = "eeb504df2ab37cf68152a237820009167c4c2ddb734b69dc8e07398cd0ca1af8e3d0fac0d608da7dcd1f8fe9e701b2511bb3c802c82b370255523a74f5ba12ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-extras \
python3.13dist-extras \
python313-extras \
python3dist-extras"

RDEPENDS:${PN} += "python-abi"

inherit rpm
