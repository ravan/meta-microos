SUMMARY = "Busybox applets replacing xz"
DESCRIPTION = "This package contains the symlinks to replace xz with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.38.0"

RPM_NAME = "busybox-xz-1.38.0-42.2.noarch.rpm"
RPM_HASH = "39fa2b9d57ce715630b4a7a7fe49dcd1ac91f5486a52e395136dd4a18de78476e368fe783881945883203afdda2776d918c1eba51998e169747edbcf59f7dbe2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-xz"

RDEPENDS:${PN} += "busybox"

inherit rpm
