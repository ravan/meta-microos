SUMMARY = "NVM Express user space tools"
DESCRIPTION = "NVM Express (NVMe) is a direct attached storage interface. The \
nvme-cli package contains core management tools with minimal \
dependencies."
LICENSE = "GPL-2.0-only"

PV = "3.0+6.g1ac60ca4b"

RPM_NAME = "nvme-cli-3.0+6.g1ac60ca4b-1.1.aarch64.rpm"
RPM_HASH = "5083bb8447082adfc0e4eef9e73b17aeb84ca6320a80385617354a04b8ba0add98051a1deaaedee699c25a27d828ec45692153fd15b9611e5777a41c62b3dcef"

RPROVIDES:${PN} += "nvme-cli \
nvmeof-boot-support"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libjson-c.so.5 \
libkmod.so.2 \
libnvme3.so.1"

inherit rpm
