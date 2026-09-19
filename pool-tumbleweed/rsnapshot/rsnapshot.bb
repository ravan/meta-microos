SUMMARY = "Backup program using hardlinks"
DESCRIPTION = "rsnapshot is a filesystem snapshot utility for making backups of local \
and remote systems. Using rsync and hard links, it is possible to keep \
multiple, full backups instantly available. The disk space required is \
just a little more than the space of one full backup, plus \
incrementals. Depending on your configuration, it is quite possible to \
set up in just a few minutes. Files can be restored by the users who \
own them, without the root user getting involved. There are no tapes to \
change, so once it's set up, you may never need to think about it \
again."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.5"

RPM_NAME = "rsnapshot-1.4.5-1.8.noarch.rpm"
RPM_HASH = "971adbfb298c89b231100e61a2af08d5d4606897320213faca14f2caec3f323a1f863e98d428f41153603964be57754e3650f2d4c99498f52a67978e495389e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-rsnapshot \
rsnapshot"

RDEPENDS:${PN} += "/usr/bin/perl \
logrotate \
openssh \
perl \
rsync \
util-linux-systemd"

inherit rpm
