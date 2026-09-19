SUMMARY = "OSS based audio support for QEMU"
DESCRIPTION = "This package contains a module for OSS based audio support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "11.1.1"

RPM_NAME = "qemu-audio-oss-11.1.1-1.1.aarch64.rpm"
RPM_HASH = "0e08e90cb4ba8a437dc259236c394d8dfb72c3400e6870a976400958d54e3c5a4da8d963681c05f706b2f34e7582e7bfa0d5c5ea8b4a05f3016e1c9ea966d64a"

RPROVIDES:${PN} += "qemu-audio-oss"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
