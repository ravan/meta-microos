SUMMARY = "NTFS Utilities which can damage your filesystem such that Windows can't read it"
DESCRIPTION = "These are programs which are considered non-functional or only test-oriented.  They are kept in the source \
tarball so that volunteers can capitalize on them for improvement. \
 \
In particular ntfsck is just a place holder.  Distributions are expected not to recommend inserting a positive value in the last field of /etc/fstab for ntfs partitions. \
 \
They have been orphaned for ten years and are unlikely to be upgraded (except ntfsfallocate, if there is some demand)."
LICENSE = "GPL-2.0-or-later"

PV = "2026.7.7"

RPM_NAME = "ntfsprogs-extra-2026.7.7-1.1.aarch64.rpm"
RPM_HASH = "6b3b1652766aa46b168d6903b2d93d161975e96d046bd7044ea2b2192d62818333626effd821ed91dbc8001a52d9a2d13ca288868bac6dc54d784b032c9bef50"

RPROVIDES:${PN} += "ntfsprogs-extra"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libntfs-3g.so.90"

inherit rpm
