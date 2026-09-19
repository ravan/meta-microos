SUMMARY = "Development files for numba applications"
DESCRIPTION = "This package contains files for developing applications using numba."
LICENSE = "BSD-2-Clause"

PV = "0.67.0"

RPM_NAME = "python313-numba-devel-0.67.0-1.1.aarch64.rpm"
RPM_HASH = "6aa29560e09608a81276391d74057bb12d100c4607a938998ce4ea7552b4a74695012ea3f8700906a00ca5e026f2105e555d666c204d980081ace4923df022dc"

RPROVIDES:${PN} += "python3-numba-devel \
python313-numba-devel"

RDEPENDS:${PN} += "python-abi \
python313-devel \
python313-numba \
python313-numpy-devel"

inherit rpm
