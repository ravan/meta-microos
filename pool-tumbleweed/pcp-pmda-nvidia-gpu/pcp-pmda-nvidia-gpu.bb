SUMMARY = "Performance Co-Pilot (PCP) metrics for the Nvidia GPU"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about Nvidia GPUs."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-pmda-nvidia-gpu-6.3.8-3.1.aarch64.rpm"
RPM_HASH = "a004cd3bc204eacbeb2df7d6453926603b25799e7bf6cbc8c199ae75b091e9ade3df0a1d28f049b55163e8bae55527055a81732406d5ff69ee0e8ce80c97a0a8"

RPROVIDES:${PN} += "pcp-pmda-nvidia-gpu"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3"

inherit rpm
