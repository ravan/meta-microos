SUMMARY = "Systemd gdm.service file"
DESCRIPTION = "GDM's systemd service file. \
By default openSUSE uses xdm which enables the DM based on sysconfig. \
This package is only needed if the system administrator wishes to use \
'systemctl' instead of openSUSE's default 'update-alternatives' method."
LICENSE = "GPL-2.0-or-later"

PV = "50.3"

RPM_NAME = "gdm-systemd-50.3-1.1.noarch.rpm"
RPM_HASH = "9f2746cc50ff253f894b057dd5482771126ca081fc8b736033348235653d378aa06ba5e6a2349820d8f727660799c329560b8fae2ae4589c7672e8e2163b8ae6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gdm-systemd"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
gdm"

inherit rpm
