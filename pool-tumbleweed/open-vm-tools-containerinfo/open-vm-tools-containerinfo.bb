SUMMARY = "Container Info Plugin"
DESCRIPTION = "This package interfaces with the container runtime to retrieve a list of containers running on a Linux guest"
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "13.1.0"

RPM_NAME = "open-vm-tools-containerinfo-13.1.0-2.3.aarch64.rpm"
RPM_HASH = "8d0aaad28c417dc80f50825d9c86d78679e947c796569a82a45e4bcd79db70c4c02ccc525f9e8c83bdd65289b36b55f809b4b7c3c9af98625baecb5f41bfb9aa"

RPROVIDES:${PN} += "libcontainerInfo.so \
open-vm-tools-containerinfo"

RDEPENDS:${PN} += "/usr/bin/sh \
curl \
ld-linux-aarch64.so.1 \
libabsl-cord.so.2608.0.0 \
libabsl-cordz-functions.so.2608.0.0 \
libabsl-cordz-info.so.2608.0.0 \
libabsl-hash.so.2608.0.0 \
libabsl-log-internal-check-op.so.2608.0.0 \
libabsl-log-internal-message.so.2608.0.0 \
libabsl-log-internal-nullguard.so.2608.0.0 \
libabsl-strings.so.2608.0.0 \
libabsl-synchronization.so.2608.0.0 \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgpr.so.51 \
libgrpc++.so.1.76 \
libgrpc.so.51 \
libprotobuf.so.36.1.0 \
libstdc++.so.6 \
libvmtools.so.0 \
open-vm-tools"

inherit rpm
