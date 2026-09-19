SUMMARY = "Persistent classic network interface naming scheme"
DESCRIPTION = "This package, when installed, disables the default 'Predictable \
Network Interface Naming' scheme[PNIN] in udev, and switches it to a \
first-loaded-first-named, reboot-persistent scheme. \
 \
[PNIN] http://freedesktop.org/wiki/Software/systemd/PredictableNetworkInterfaceNames/ \
 \
Differences from PNIN: \
* Re-enumeration when the L2 address changes. \
* Interface names are not - and cannot be - derived from another property \
  like PCI bus address."
LICENSE = "GPL-2.0"

PV = "0.1"

RPM_NAME = "udev-persistent-ifnames-0.1-2.24.noarch.rpm"
RPM_HASH = "7340209daeff2d0bdb49105a6151636e6fb62887910db8a931239468700b47d334bc84de29fc0f5991a1f130e5131a08898683d74ad3d296d464788c22683c11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "udev-persistent-ifnames"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh"

inherit rpm
