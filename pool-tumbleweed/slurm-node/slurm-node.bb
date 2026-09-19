SUMMARY = "Minimal slurm node"
DESCRIPTION = "This package contains just the minmal code to run a compute node."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "25.11.2"

RPM_NAME = "slurm-node-25.11.2-1.6.aarch64.rpm"
RPM_HASH = "70ceda06954801d379055b914dd4417fe836bdfb8cf19d66ad8f107b2dd47635e41557c5d288d52e2f879a32de0b92b998c06b1f412f892feb5fbe2b6d75332a"

RPROVIDES:${PN} += "slurm-node"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libhwloc.so.15 \
liblua5.4.so.5 \
liblz4.so.1 \
libm.so.6 \
libpam-misc.so.0 \
libpam.so.0 \
libresolv.so.2 \
libslurmfull.so \
slurm-config \
slurm-plugins"

inherit rpm
