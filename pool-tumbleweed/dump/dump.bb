SUMMARY = "Programs for backing up and restoring ext2/3/4 filesystems"
DESCRIPTION = "The dump package contains both dump and restore.  Dump examines files \
in a file system, determines which ones need to be backed up, and \
copies those files to a specified disk, tape, or other storage medium. \
The restore command performs the inverse function of dump. It can \
restore a full backup of a file system."
LICENSE = "BSD-3-Clause"

PV = "0.4b53"

RPM_NAME = "dump-0.4b53-2.3.aarch64.rpm"
RPM_HASH = "914d4a357544d2a53e73f32dc9ec70ab069d284b74453d0eeed67741ca3a571acf4f37ea67021b2814404db5d0ea1c83edd2937388395191eb76d47d0c716c73"

RPROVIDES:${PN} += "dump"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblkid.so.1 \
libbz2.so.1 \
libc.so.6 \
libcom-err.so.2 \
libe2p.so.2 \
libext2fs.so.2 \
liblzo2.so.2 \
libreadline.so.8 \
libselinux.so.1 \
libz.so.1"

inherit rpm
