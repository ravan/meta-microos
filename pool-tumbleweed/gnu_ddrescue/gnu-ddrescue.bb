SUMMARY = "I/O error aware data recovery and copying utility"
DESCRIPTION = "GNU ddrescue is a data recovery tool. It copies data from one file or \
block device (hard disk, CD-ROM, etc.) to another, trying hard to \
rescue data in case of read errors. \
 \
It is more memory and time efficient than dd_rescue+dd_rhelp on disks \
with more than a few hundred bad sectors."
LICENSE = "GPL-2.0-or-later"

PV = "1.30"

RPM_NAME = "gnu_ddrescue-1.30-1.4.aarch64.rpm"
RPM_HASH = "dc44d3c31597b2f08846b3e48779d8c8c7a33da6dca37fc60a6691bcf4b144f4f9c3fb7e64dfbd60fcb53ac9844ee4217316e3bf04cec6b08690345a1d57a865"

RPROVIDES:${PN} += "gnu-ddrescue"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
