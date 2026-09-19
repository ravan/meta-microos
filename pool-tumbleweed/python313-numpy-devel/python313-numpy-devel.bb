SUMMARY = "Development files for numpy applications"
DESCRIPTION = "This package contains files for developing applications using numpy."
LICENSE = "BSD-3-Clause"

PV = "2.5.3"

RPM_NAME = "python313-numpy-devel-2.5.3-1.1.aarch64.rpm"
RPM_HASH = "d008784f941f7b4e0e5a60f3f4891651110e5fb5d96cff86935c29e185a21fc3d55fc33fd9b87b26a5fc3dcaf2f1e4c325dcd1261f19ee496db1b73a5c5af547"

RPROVIDES:${PN} += "python3-numpy-devel \
python313-numpy-devel"

RDEPENDS:${PN} += "blas-devel \
cblas-devel \
lapack-devel \
python-abi \
python313-devel \
python313-numpy"

inherit rpm
