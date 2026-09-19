SUMMARY = "Python binding for libfdt"
DESCRIPTION = "libfdt is a library to process Open Firmware style device trees on various \
architectures. \
 \
Python binding part."
LICENSE = "BSD-2-Clause & GPL-2.0-only"

PV = "1.7.2.post1"

RPM_NAME = "python313-pylibfdt-1.7.2.post1-1.8.aarch64.rpm"
RPM_HASH = "3242342e0295d37ef4ff7334e5881d9d48cb231aff5e83512d1e83fb13397764efdec31900a2ab69d5dd5183e51760d985174216a92b19503d936ed884095d97"

RPROVIDES:${PN} += "python3-pylibfdt \
python3.13dist-pylibfdt \
python313-pylibfdt \
python3dist-pylibfdt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
