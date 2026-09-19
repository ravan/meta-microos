SUMMARY = "Simple Server for Git Repositories"
DESCRIPTION = "A really simple TCP git daemon. In the default configuration it allows \
read only access to repositories in /srv/git/ that contain the \
'git-daemon-export-ok' file."
LICENSE = "GPL-2.0-only"

PV = "2.55.0"

RPM_NAME = "git-daemon-2.55.0-3.2.aarch64.rpm"
RPM_HASH = "f1408a3d5eb0f4158cd276bcf028a0b62bee583d63fcbd5b5a2f766724054ac9bcdd681bc5d1e7759fb025745179759e6aaf92aa3ce9a3f317dc00c0cbaaef17"

RPROVIDES:${PN} += "git-daemon \
group-git-daemon \
user-git-daemon"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
bash \
fillup \
git-core \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsha1detectcoll.so.1 \
libz.so.1 \
systemd \
sysuser-shadow"

inherit rpm
