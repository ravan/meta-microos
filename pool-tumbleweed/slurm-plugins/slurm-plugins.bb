SUMMARY = "SLURM plugins (loadable shared objects)"
DESCRIPTION = "This package contains the SLURM plugins (loadable shared objects)"
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "25.11.2"

RPM_NAME = "slurm-plugins-25.11.2-1.6.aarch64.rpm"
RPM_HASH = "9a3fe36bd400b0a06679779ef21060c57d59406d78ea1167f06b14575ec8aae61aa88cf28fcaffc851e93fe6b4b68e7b77a20bd6591cc46a5a137d8f6a2cf802"

RPROVIDES:${PN} += "config-slurm-plugins \
libslurm-pmi.so \
libslurmfull.so \
slurm-plugins"

RDEPENDS:${PN} += "libc.so.6 \
libcurl.so.4 \
libdbus-1.so.3 \
libhttp-parser.so.2.9 \
libibmad.so.5 \
libjson-c.so.5 \
liblua5.4.so.5 \
libm.so.6 \
libpmix2 \
libresolv.so.2 \
libyaml-0.so.2 \
pmix \
slurm-config"

inherit rpm
