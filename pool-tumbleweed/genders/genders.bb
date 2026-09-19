SUMMARY = "Static cluster configuration database"
DESCRIPTION = "Genders is a static cluster configuration database used for cluster \
configuration management.  It is used by a variety of tools and \
scripts for management of large clusters.  The genders database is \
typically replicated on every node of the cluster. It describes the \
layout and configuration of the cluster so that tools and scripts can \
sense the variations of cluster nodes. By abstracting this information \
into a plain text file, it becomes possible to change the \
configuration of a cluster by modifying only one file."
LICENSE = "GPL-2.0-or-later"

PV = "1.32"

RPM_NAME = "genders-1.32-1.10.aarch64.rpm"
RPM_HASH = "896a0800d98c9115f5956df8e660a8d1a791d87f1ab3c638432b901e8600cf753a4a58fd4dbf466c8382f276b6e7dc3ceb195290057e90bf1009c5d751aeb054"

RPROVIDES:${PN} += "genders"

RDEPENDS:${PN} += "genders-base \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgenders.so.0"

inherit rpm
