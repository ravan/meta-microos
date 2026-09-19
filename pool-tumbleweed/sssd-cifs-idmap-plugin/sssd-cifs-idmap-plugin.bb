SUMMARY = "The sssd idmap plugin for cifs.idmap"
DESCRIPTION = "The cifs.idmap(8) userspace helper relies on a plugin to handle the \
ID mapping. This package contains the ID mapping plugin that will use \
sssd. \
 \
In SUSE systems, only one such plugin can be installed at a time \
(either the one from sssd, or from cifs-utils). \
Without the plugin, file objects in a mounted share have UID/GID of \
the original mounting process."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "2.13.1"

RPM_NAME = "sssd-cifs-idmap-plugin-2.13.1-2.1.aarch64.rpm"
RPM_HASH = "440e7769c87d462d5b35461f4ea231f13ec27a492a1c40290de7465062315f6a1408615cb49190328981685da50751cb17cb29b629b4b8f5af4472ee36cbdcd2"

RPROVIDES:${PN} += "cifs-idmap-plugin \
sssd-cifs-idmap-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsss-idmap.so.0 \
libsss-nss-idmap.so.0"

inherit rpm
