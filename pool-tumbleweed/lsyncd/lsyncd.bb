SUMMARY = "Live Syncing (Mirror) Daemon"
DESCRIPTION = "Lsyncd (Live Syncing (Mirror) Daemon) uses rsync to synchronize local directories with a remote machine running rsyncd. It watches multiple directory trees through inotify. The first step after adding the watches is to rsync all directories with the remote host, and then the software synchronizes single files by collecting the inotify events. lsyncd is a lightweight live mirror solution that should be easy to install and use while blending well with your system."
LICENSE = "GPL-2.0-only"

PV = "2.3.1"

RPM_NAME = "lsyncd-2.3.1-2.12.aarch64.rpm"
RPM_HASH = "069556efd45de6c20d078aec3ee6891f4ea253d76ccb2fa8e01cbd8a8e391a3345e23c3d7d6b5f575e62d3b2dcf1176f991bcbadd228da1d8f4abcfb511fed97"

RPROVIDES:${PN} += "config-lsyncd \
lsyncd"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblua5.4.so.5 \
logrotate \
rsync \
systemd"

inherit rpm
