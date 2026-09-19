SUMMARY = "Busybox applets replacing gawk"
DESCRIPTION = "This package contains the symlinks to replace gawk with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.38.0"

RPM_NAME = "busybox-gawk-1.38.0-42.2.noarch.rpm"
RPM_HASH = "f96069b90fdf8dbb66acb27e28e0db0bab3f94946cf6a9a46dd4168637f81d3c941ba516498791038a60fe26767be060d29b3454299bf43e686f783a253eeb32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/bin/awk \
busybox-gawk"

RDEPENDS:${PN} += "busybox"

inherit rpm
