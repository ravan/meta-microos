SUMMARY = "Experimental APFS tools for Linux"
DESCRIPTION = "apfsprogs is a suite of userland software to work with the Apple File System \
on Linux. It's intended mainly to help test the Linux kernel module that can \
be retrieved from <git://github.com/eafer/linux-apfs-rw.git>. The following \
are included: \
 \
  o mkapfs: an experimental filesystem build tool \
  o apfs-snap: a tool to take snapshots of a volume mounted with our module \
  o apfsck: a filesystem integrity checker, for now only useful for testers"
LICENSE = "GPL-2.0-only"

PV = "0.2.1"

RPM_NAME = "apfsprogs-0.2.1-1.6.aarch64.rpm"
RPM_HASH = "4c2975f258de424657f110a5c9fea33c3c20d505501ff974d69d253761146357762172d0c01678529ae55cb8c17cda7a6f0c77caaa5dc8ddbff279d42ec0cf10"

RPROVIDES:${PN} += "apfsprogs"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
