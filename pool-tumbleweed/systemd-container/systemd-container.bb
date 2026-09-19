SUMMARY = "Systemd tools for container management"
DESCRIPTION = "Systemd tools to spawn and manage containers and virtual machines. \
 \
In addition, it also contains a plugin for the Name Service Switch (NSS), \
providing host name resolution for all local containers and virtual machines \
using network namespacing and registered with systemd-machined. It also maps \
UID/GIDs ranges used by containers to useful names. \
 \
To activate this NSS module, you will need to include it in /etc/nsswitch.conf, \
see nss-mymachines(8) manpage for more details."
LICENSE = "LGPL-2.1-or-later"

PV = "261.2"

RPM_NAME = "systemd-container-261.2-1.2.aarch64.rpm"
RPM_HASH = "0694da5a9abb76c1fdef471f528f08ced0ab57f5db9323dc1ce384fda528c95263ba8233c2089892c7984e65e1d0c359428ba4ca3c300e6a913efca76dc4166f"

RPROVIDES:${PN} += "libnss-mymachines.so.2 \
nss-mymachines \
systemd-/usr/bin/systemd-nspawn \
systemd-container"

RDEPENDS:${PN} += "/usr/bin/gpg \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libarchive13 \
libc.so.6 \
libsystemd-shared-261.2-1.2.so \
systemd"

inherit rpm
