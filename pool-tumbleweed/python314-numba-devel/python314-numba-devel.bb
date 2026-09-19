SUMMARY = "Development files for numba applications"
DESCRIPTION = "This package contains files for developing applications using numba."
LICENSE = "BSD-2-Clause"

PV = "0.67.0"

RPM_NAME = "python314-numba-devel-0.67.0-1.1.aarch64.rpm"
RPM_HASH = "a60fd3776197bca54927260188023dc38b7e6ff3b955d260ba071a775e5543adb082c6e95134907f06fe158f03d8e689e554a0c7ce579936d0579b4f0504d0cb"

RPROVIDES:${PN} += "python314-numba-devel"

RDEPENDS:${PN} += "python-abi \
python314-devel \
python314-numba \
python314-numpy-devel"

inherit rpm
