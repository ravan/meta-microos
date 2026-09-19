SUMMARY = "Gtk interface virt-scenario"
DESCRIPTION = "This is the Gtk interface for virt-scenario."
LICENSE = "GPL-3.0-or-later"

PV = "2.1.3"

RPM_NAME = "virt-scenario-gtk-2.1.3-4.1.noarch.rpm"
RPM_HASH = "00ae1889f1508e16fea9eb92b491f53334cf890fa41e4c42e67f2f10093fc2a3b1bccdde3934260a0de3b634052ee1cf98177c40257a3bfff9ab4a09e28e89ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "virt-scenario-gtk"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
virt-scenario"

inherit rpm
