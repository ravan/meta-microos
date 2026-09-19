SUMMARY = "Realtime Kernel Testsuite"
DESCRIPTION = "The Realtime Kernel Testsuite measures real-time attributes of the kernel, \
specifically timer and signal latency and the functionality of Priority \
Inheritance Mutexes."
LICENSE = "GPL-2.0-only"

PV = "2.10"

RPM_NAME = "rt-tests-2.10-1.3.aarch64.rpm"
RPM_HASH = "c0f9cd01234587ef403411dbbb840b7cccef08c7a730d4afd1342994481eebd6b50242ee0ab0ac8617e9c373b2e9cf4cbd2bddb853150b568b919e44ce62d372"

RPROVIDES:${PN} += "rt-tests"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnuma.so.1 \
python-abi"

inherit rpm
