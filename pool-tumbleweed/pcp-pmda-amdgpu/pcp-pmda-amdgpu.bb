SUMMARY = "Performance Co-Pilot (PCP) metrics from AMD GPU devices"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
extracting performance metrics from AMDGPU devices."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-pmda-amdgpu-6.3.8-3.1.aarch64.rpm"
RPM_HASH = "fa237d103d6fac82e701514c437faa8e4247dc893d3be98e82488de9081d44e19114454eaf66cf64e51580e8b237033da4f31eb94af70b49604585a4b1371e39"

RPROVIDES:${PN} += "pcp-pmda-amdgpu"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm-amdgpu.so.1 \
libdrm.so.2 \
libpcp-pmda.so.3 \
libpcp.so.3 \
pcp"

inherit rpm
