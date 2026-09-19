SUMMARY = "SLURM graphical interface"
DESCRIPTION = "sview is a graphical user interface to get and update state information for \
jobs, partitions, and nodes managed by SLURM."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "25.11.2"

RPM_NAME = "slurm-sview-25.11.2-1.6.aarch64.rpm"
RPM_HASH = "59098a0665b1a302fad45444c0c638e1ea1cb836abc85eb3e0a54e452ef6ed947899f40b4a4f5ae167ff6764f7cc8979f2248296275b1dddc543208d57254f1e"

RPROVIDES:${PN} += "slurm-sview"

RDEPENDS:${PN} += "libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libslurmfull.so \
slurm-plugins"

inherit rpm
