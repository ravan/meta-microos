SUMMARY = "Python version specific development files for pybind11_abseil"
DESCRIPTION = "pybind11-abseil provides adapters that make Abseil types work with Pybind11 bindings. \
 \
This package provides the python version specific shared objects to develop \
applications against pybind11_abseil."
LICENSE = "BSD-3-Clause"

PV = "202402.0"

RPM_NAME = "python313-pybind11_abseil-202402.0-3.8.aarch64.rpm"
RPM_HASH = "17c8bc4739dea036243beeef51a7f8669770b67a527cd13439b71a50df6f3822f2bf5e5eba1e12796464bf18e02a7842655a5a53759c12684dec26544c933f5f"

RPROVIDES:${PN} += "python3-pybind11-abseil \
python313-pybind11-abseil"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libabsl-cord.so.2608.0.0 \
libabsl-status.so.2608.0.0 \
libabsl-statusor.so.2608.0.0 \
libabsl-strings.so.2608.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi \
python313-abseil \
python313-numpy"

inherit rpm
