SUMMARY = "FFT based image registration"
DESCRIPTION = "Imreg is a Python library that implements an FFT-based technique for \
translation, rotation and scale-invariant image registration."
LICENSE = "BSD-3-Clause"

PV = "2025.1.1"

RPM_NAME = "python313-imreg-2025.1.1-1.4.noarch.rpm"
RPM_HASH = "7fb756f35aeefc2870683d6a12bfb248f2d691e2b77408dd658ffe79887f46ba6226d5bc426efecdf401b3ce7ca5088b499649f9fb7833f8c58d4cd293da3111"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-imreg \
python3.13dist-imreg \
python313-imreg \
python3dist-imreg"

RDEPENDS:${PN} += "python-abi \
python313-numpy \
python313-scipy"

inherit rpm
