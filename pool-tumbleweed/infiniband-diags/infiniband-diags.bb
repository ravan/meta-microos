SUMMARY = "InfiniBand Diagnostic Tools"
DESCRIPTION = "diags provides IB diagnostic programs and scripts needed to diagnose an \
IB subnet."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "63.0"

RPM_NAME = "infiniband-diags-63.0-1.3.aarch64.rpm"
RPM_HASH = "f6d79313dbd1b6c249165491e48400815b5a8d3d2e78ffa3a1c423181f48e3fb7491e88a3029810e67f5fde4a7268d482890a6891f055736ecd1dd891892bff6"

RPROVIDES:${PN} += "config-infiniband-diags \
infiniband-diags"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libibmad.so.5 \
libibnetdisc.so.5 \
libibumad.so.3 \
perl"

inherit rpm
