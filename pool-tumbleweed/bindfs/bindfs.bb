SUMMARY = "Filesystem for mapping directories with alternate permissions"
DESCRIPTION = "bindfs is a FUSE filesystem for mounting a directory to another \
location, similarly to mount --bind. The permissions inside the \
mountpoint can be altered using various rules."
LICENSE = "GPL-2.0-or-later"

PV = "1.18.4"

RPM_NAME = "bindfs-1.18.4-1.5.aarch64.rpm"
RPM_HASH = "e1937588215dda51993b8e9dbe5edd405e94bad86b4913259dbcf624e3475907b898a46c020b80d9a4bbb38e512c7e81789052a8dcdd8748fa30b0381b1c52d9"

RPROVIDES:${PN} += "bindfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse3.so.4"

inherit rpm
