SUMMARY = "Busybox applets replacing vlan"
DESCRIPTION = "This package contains the symlinks to provide vlan with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.38.0"

RPM_NAME = "busybox-vlan-1.38.0-42.2.noarch.rpm"
RPM_HASH = "e1b9f20f7a30c9a51bba9dbff68d661fd31a58bf56f85c5e41d5966ac0275a682e340a3dc9a24b7197cb67fd37cc12dcffafa170bf3e83ca0d971e7b118edf51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-vlan"

RDEPENDS:${PN} += "busybox"

inherit rpm
