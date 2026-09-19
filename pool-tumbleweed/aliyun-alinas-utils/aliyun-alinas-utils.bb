SUMMARY = "Utilities for Aliyun Alinas File System (alinas)"
DESCRIPTION = "Utilities for Aliyun Alinas and CPFS File System (alinas)"
LICENSE = "MIT"

PV = "2.2+20260207_0a55ca4"

RPM_NAME = "aliyun-alinas-utils-2.2+20260207_0a55ca4-1.3.aarch64.rpm"
RPM_HASH = "ad47a582a794f0bb7e375cd1e9c3f16f92cb460a277a488bbed40a59dcd6bace79a5bc1760b3f0f87c62eca09e154af59ecbc87bcb87ef02938eea20d4f2aff8"

RPROVIDES:${PN} += "aliyun-alinas-utils \
config-aliyun-alinas-utils"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/sh \
libc.so.6 \
python-abi"

inherit rpm
