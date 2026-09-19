SUMMARY = "Python binding for libfdt"
DESCRIPTION = "libfdt is a library to process Open Firmware style device trees on various \
architectures. \
 \
Python binding part."
LICENSE = "BSD-2-Clause & GPL-2.0-only"

PV = "1.7.2.post1"

RPM_NAME = "python314-pylibfdt-1.7.2.post1-1.8.aarch64.rpm"
RPM_HASH = "d48cf86fb1cd2b7b158bd5e4885968f5cc69964498e25f6b71ed2912bcb6e9a17341ffbad209112bcbd2c98746e28b5cfc9e7b3a23e8bfa7b6f42a66caa9405d"

RPROVIDES:${PN} += "python3.14dist-pylibfdt \
python314-pylibfdt \
python3dist-pylibfdt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
