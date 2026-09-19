SUMMARY = "Configuration utilities for bcache"
DESCRIPTION = "This package contains utilities for creating and inspecting \
bcache filesystems."
LICENSE = "GPL-2.0-only"

PV = "1.1+git37.a5e3753"

RPM_NAME = "bcache-tools-1.1+git37.a5e3753-2.6.aarch64.rpm"
RPM_HASH = "3ff1a025cc9de0ae25a7fe7ddd6d26a4211a8240153d0903e774b951dd0131f82d091139d71fa4b8f9aed0b9255e39b1af871ac0a242f08a1cb1e3076d2e9bbf"

RPROVIDES:${PN} += "bcache-tools"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libuuid.so.1"

inherit rpm
