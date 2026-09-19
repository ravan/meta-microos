SUMMARY = "Lightweight, extensible meta-backup system"
DESCRIPTION = "Backupninja allows you to coordinate system backup by dropping a few simple \
configuration files into /etc/backup.d/. Most programs you might use for making \
backups don't have their own configuration file format. Backupninja provides a \
centralized way to configure and coordinate many different backup utilities. \
The key features of backupninja are: \
- easy to read ini style configuration files. \
- you can drop in scripts to handle new types of backups. \
- backup actions can be scheduled."
LICENSE = "GPL-2.0-only"

PV = "1.2.2"

RPM_NAME = "backupninja-1.2.2-3.7.aarch64.rpm"
RPM_HASH = "273a50656f46a56d36039b2ce416a1d59a8479587bde04d3736b88e59eecf54a04cc4401a53f9f5b06b9dc48ceebce0e7c359c21fbc4f955afc4ec0c7489ff36"

RPROVIDES:${PN} += "backupninja \
config-backupninja"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
bash \
dialog \
gawk \
gzip \
logrotate \
pkgconfig-systemd"

inherit rpm
