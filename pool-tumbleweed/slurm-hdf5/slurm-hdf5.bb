SUMMARY = "Store accounting data in hdf5"
DESCRIPTION = "Plugin to store accounting in the hdf5 file format. This plugin has to be \
activated in the slurm configuration. Includes also utility the program \
sh5utils to merge this hdf5 files or extract data from them."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "25.11.2"

RPM_NAME = "slurm-hdf5-25.11.2-1.6.aarch64.rpm"
RPM_HASH = "f72725367f91acf6c39185be22f5ae3d22c829b84df93d45d0acc9d2b891181a9ec58aefe54b3fc4e276450c5047f384412d952a499260dd1ab99771651debb1"

RPROVIDES:${PN} += "slurm-hdf5"

RDEPENDS:${PN} += "libc.so.6 \
libhdf5-hl.so.310 \
libhdf5.so.310 \
libslurmfull.so \
slurm-plugins"

inherit rpm
