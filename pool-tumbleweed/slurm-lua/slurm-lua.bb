SUMMARY = "Lua API for SLURM"
DESCRIPTION = "This package includes the Lua API to provide an interface to SLURM \
through Lua."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "25.11.2"

RPM_NAME = "slurm-lua-25.11.2-1.6.aarch64.rpm"
RPM_HASH = "8427966631591c8f066865de8606bca7de7fbf5c12e78d3861bfb6a6dd9b40313ce16345a9d641d5f0d95c51ebebe622f67b9201f4b187ccd2af229cb740a857"

RPROVIDES:${PN} += "slurm-lua"

RDEPENDS:${PN} += "libc.so.6 \
liblua5.4.so.5 \
slurm"

inherit rpm
