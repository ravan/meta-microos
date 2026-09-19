SUMMARY = "Static analysis tool for C"
DESCRIPTION = "Smatch is a static analysis tool for C. Most of the checks are for the linux \
kernel. Please write checks for your project. It's fun and easy!"
LICENSE = "GPL-2.0-only"

PV = "1.75+20260504"

RPM_NAME = "smatch-1.75+20260504-1.3.aarch64.rpm"
RPM_HASH = "9d3bbf061b8a5d820b90c0f169de735d942ae64e5c8f56386ff17fa68c88950909c81be380110d7f3cb110cae693d0f6a83e4753642819d3bfd1dec71d258d5e"

RPROVIDES:${PN} += "smatch"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libsqlite3.so.0"

inherit rpm
