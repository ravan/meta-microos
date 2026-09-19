SUMMARY = "Userspace Unionfs File System"
DESCRIPTION = "unionfs-fuse overlays several directory into one single mount point \
 \
It  first  tries to access the file on the top branch and if the file \
does not exist there, it continues on lower level branches. If the user \
tries to modify a file on a lower level read-only branch the file is \
copied to to a higher level read-write branch if the copy-on-write \
(cow) mode was enabled."
LICENSE = "BSD-3-Clause"

PV = "3.7"

RPM_NAME = "unionfs-fuse-3.7-1.5.aarch64.rpm"
RPM_HASH = "c6868c993096fc84b509564f866ae0a3a5e94b26a041a7580db5e511b0bc2a07f35c04c3cd00e29770d52b440e7ca02b2441eab723e23c17bb7e2650fd378881"

RPROVIDES:${PN} += "unionfs-fuse"

RDEPENDS:${PN} += "/usr/bin/bash \
fuse3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse3.so.4"

inherit rpm
