SUMMARY = "Busybox applets replacing vim"
DESCRIPTION = "This package contains the symlinks to provide vi with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.38.0"

RPM_NAME = "busybox-vi-1.38.0-42.2.noarch.rpm"
RPM_HASH = "60dc593503d704769fcae883387dbe1ba1abf1c0377894c7607e96e48e89712e079a825525283f04444f7b50d8bd77a9936bc925eaa470906e083e2fcfbe812d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-vi"

RDEPENDS:${PN} += "busybox"

inherit rpm
