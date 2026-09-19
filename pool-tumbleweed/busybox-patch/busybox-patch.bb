SUMMARY = "Busybox applets replacing patch"
DESCRIPTION = "This package contains the symlinks to replace patch with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.38.0"

RPM_NAME = "busybox-patch-1.38.0-42.2.noarch.rpm"
RPM_HASH = "e6b5f0bd7a6a140da282153d3ff1e4d5ef4a6db025f828468cffdd627445bf432e0cb7cf8cc5336ac430a9b36bf2a1852042e846686c52e999116c1dec1dbd8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-patch"

RDEPENDS:${PN} += "busybox"

inherit rpm
