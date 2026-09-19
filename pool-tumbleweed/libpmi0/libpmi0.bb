SUMMARY = "SLURM PMI Library"
DESCRIPTION = "This package contains the library needed to run programs dynamically linked \
with SLURM."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "25.11.2"

RPM_NAME = "libpmi0-25.11.2-1.6.aarch64.rpm"
RPM_HASH = "a13bab26565e9d0a51923ee9cc5f82995afd434f323225776c4e0865c2b95131285c7a2a710d862ceccfa522e8437a9c66ffe37ac20c7a2daa985d14a9cbbec4"

RPROVIDES:${PN} += "libpmi.so.0 \
libpmi0 \
libpmi2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libslurm-pmi.so"

inherit rpm
