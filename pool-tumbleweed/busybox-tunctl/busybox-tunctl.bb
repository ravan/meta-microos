SUMMARY = "Busybox applets replacing tunctl"
DESCRIPTION = "This package contains the symlinks to provide tunctl with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.38.0"

RPM_NAME = "busybox-tunctl-1.38.0-42.2.noarch.rpm"
RPM_HASH = "caa3d8e3983c53c0c37054df0cf5aa029adeccb69d2a9eacd0213329abab5900e37add125527173fbdd061fae51017d188edca3323d0b64a3620ad83c5fc3d54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-tunctl"

RDEPENDS:${PN} += "busybox"

inherit rpm
