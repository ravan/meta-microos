SUMMARY = "Python version specific development files for pybind11_abseil"
DESCRIPTION = "pybind11-abseil provides adapters that make Abseil types work with Pybind11 bindings. \
 \
This package provides the python version specific shared objects to develop \
applications against pybind11_abseil."
LICENSE = "BSD-3-Clause"

PV = "202402.0"

RPM_NAME = "python314-pybind11_abseil-202402.0-3.8.aarch64.rpm"
RPM_HASH = "08a05843de59a6e197c1f86aadc7d106548fc0d095de45f91beacfa93d941dd2a59f0871730002414a3590853d8f2901b979ae4a38d9c10fdeaa354bfba5c723"

RPROVIDES:${PN} += "python314-pybind11-abseil"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libabsl-cord.so.2608.0.0 \
libabsl-status.so.2608.0.0 \
libabsl-statusor.so.2608.0.0 \
libabsl-strings.so.2608.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi \
python314-abseil \
python314-numpy"

inherit rpm
