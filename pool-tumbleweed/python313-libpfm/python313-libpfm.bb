SUMMARY = "Python bindings for libpfm and perf_event_open system call"
DESCRIPTION = "This package provides python bindings for the libpfm4 package and the perf_event_open system call."
LICENSE = "MIT"

PV = "4.13.0"

RPM_NAME = "python313-libpfm-4.13.0-2.8.aarch64.rpm"
RPM_HASH = "628c40ecc9ff3cc9af523f739ae8c05d51c229f1071f842e0ba40eb1ab509c981f68977dff0be6f02d8c882743edf22f3134f18c6257f211ecaa5bba55f6db35"

RPROVIDES:${PN} += "python3-libpfm \
python3.13dist-perfmon \
python313-libpfm \
python3dist-perfmon"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpfm.so.4 \
libpfm4 \
python-abi"

inherit rpm
