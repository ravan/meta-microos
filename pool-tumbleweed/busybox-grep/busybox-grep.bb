SUMMARY = "Busybox applets replacing grep"
DESCRIPTION = "This package contains the symlinks to replace grep with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.38.0"

RPM_NAME = "busybox-grep-1.38.0-42.2.noarch.rpm"
RPM_HASH = "7e50b3b32622fc0e0ca1e0c281d651456780afa7db011d4e333818bd97effae73e503d49e7dc631129b8ba8ed835ff3798473a6f190c8ccdb4a07ae090825329"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/bin/grep \
busybox-grep"

RDEPENDS:${PN} += "busybox"

inherit rpm
