SUMMARY = "FUSE-Filesystem to access WebDAV servers"
DESCRIPTION = "davfs2 is a FUSE file system driver that allows mounting a WebDAV server \
as a local file system, like a disk drive. This way, applications can access \
resources on a Web server without knowing anything about HTTP or WebDAV. \
 \
davfs2 runs as a daemon in userspace. It uses the kernel file system 'coda', or \
FUSE. To connect to the WebDAV server, it makes use of the neon library, \
supporting TLS/SSL and access via proxy servers."
LICENSE = "GPL-3.0-or-later"

PV = "1.7.3"

RPM_NAME = "davfs2-1.7.3-1.3.aarch64.rpm"
RPM_HASH = "5f91d0479d1dc5ae05b6ad31782421763cc5d2e6fd0f61223f747ce168784d95af301b65a050ea0be9dc2706e4cec9da2df3033a14f8ab4def849db494fec892"

RPROVIDES:${PN} += "config-davfs2 \
davfs2 \
fuse-davfs2 \
group-davfs2 \
user-davfs2"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/sbin/groupadd \
/usr/sbin/useradd \
fuse \
ld-linux-aarch64.so.1 \
libc.so.6 \
libneon.so.27 \
sysuser-shadow"

inherit rpm
