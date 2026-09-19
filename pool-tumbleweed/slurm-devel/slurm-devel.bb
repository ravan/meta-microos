SUMMARY = "Development package for SLURM"
DESCRIPTION = "This package includes the header files for the SLURM API."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "25.11.2"

RPM_NAME = "slurm-devel-25.11.2-1.6.aarch64.rpm"
RPM_HASH = "28f27cc31650374df1a1201bbdd18d90c73993e3f089297f25e228b4c730708509a6a21681ef93b45fee43ebc9e724ed6f1bac122be2a56ebbde35ea29cc877c"

RPROVIDES:${PN} += "pkgconfig-slurm \
slurm-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpmi0 \
libslurm44 \
slurm"

inherit rpm
