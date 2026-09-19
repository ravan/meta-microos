SUMMARY = "File tree diff tool"
DESCRIPTION = "Compare file system trees, showing any differences in their: \
  - file size, \
  - file block count (physical storage size), \
  - owner user and group ids (uid & gid), \
  - access, modification and inode change times, \
  - hard link count, and sets of hard linked files, \
  - extended attributes (if supported), \
  - ACLs (if supported)."
LICENSE = "GPL-3.0-or-later"

PV = "0.8.9"

RPM_NAME = "tdiff-0.8.9-1.5.aarch64.rpm"
RPM_HASH = "1bad12cd8fe1e8f20b35db22c5bbda7f9e28bb7b20f98f82286bb2789367f654ff9663379bd11e1e19eea5c48710c344aa33e99011e6d926ce841840a2524095"

RPROVIDES:${PN} += "tdiff"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6"

inherit rpm
