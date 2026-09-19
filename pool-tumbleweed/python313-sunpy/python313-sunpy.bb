SUMMARY = "SunPy core package: Python for Solar Physics"
DESCRIPTION = "SunPy is a Python library for solar physics data analysis and visualization."
LICENSE = "Apache-2.0 & BSD-2-Clause & BSD-3-Clause & MIT"

PV = "7.1.2"

RPM_NAME = "python313-sunpy-7.1.2-2.2.aarch64.rpm"
RPM_HASH = "66ba0c23f46ebf09a439efcb6f571a094252b76d0c191cd492ea86d6a26cba3e7118d755162ec8c564b740d41dcc035b56ddd8a66337b10f121a4ef389d58821"

RPROVIDES:${PN} += "python3-sunpy \
python3.13dist-sunpy \
python313-sunpy \
python3dist-sunpy"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python313-aioftp \
python313-astropy \
python313-fsspec \
python313-numpy \
python313-packaging \
python313-parfive \
python313-pyerfa \
python313-requests"

inherit rpm
