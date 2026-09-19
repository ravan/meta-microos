SUMMARY = "Simple Linux Utility for Resource Management"
DESCRIPTION = "SLURM is a fault-tolerant scalable cluster management and job \
scheduling system for Linux clusters containing up to 65,536 nodes. \
Components include machine status, partition management, job \
management, scheduling and accounting modules."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "25.11.2"

RPM_NAME = "slurm-25.11.2-1.6.aarch64.rpm"
RPM_HASH = "9c4b47f12c67f5943ababd6a6210f10fc73f9a79f41002463342ecd4a530713926cb1561e91751dd585b69c67fa8766493b8f94fb093eb79ba659bae5681b1f0"

RPROVIDES:${PN} += "slurm"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
libc.so.6 \
liblz4.so.1 \
libreadline.so.8 \
libslurmfull.so \
slurm-config \
slurm-node"

inherit rpm
