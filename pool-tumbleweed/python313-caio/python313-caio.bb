SUMMARY = "Asynchronous file IO for Linux MacOS or Windows"
DESCRIPTION = "Asynchronous file IO for Linux (libaio and POSIX AIO), with a thread-pool \
based fallback. Provides a small, fast async file-IO layer."
LICENSE = "Apache-2.0"

PV = "0.12.4"

RPM_NAME = "python313-caio-0.12.4-1.1.aarch64.rpm"
RPM_HASH = "7156a53b8b0f36bb84d474aff65198e0b4aee8c4ca2637cd7edb56a4674cb2bca939156b8150fe14c3d0dd0c22235e83083daf374973dfc562b33632facc5bcc"

RPROVIDES:${PN} += "python3-caio \
python3.13dist-caio \
python313-caio \
python3dist-caio"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
