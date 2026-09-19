SUMMARY = "FFT based image registration"
DESCRIPTION = "Imreg is a Python library that implements an FFT-based technique for \
translation, rotation and scale-invariant image registration."
LICENSE = "BSD-3-Clause"

PV = "2025.1.1"

RPM_NAME = "python314-imreg-2025.1.1-1.4.noarch.rpm"
RPM_HASH = "2865b614f7a0fa63e292e9cb59d5147dabcc8608da5558e33316f46fc375dbcf49dfbd190043f3a0ec66dedd61c4e9ce0e3a7ffdceeea3612e73127128dc57d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-imreg \
python314-imreg \
python3dist-imreg"

RDEPENDS:${PN} += "python-abi \
python314-numpy \
python314-scipy"

inherit rpm
