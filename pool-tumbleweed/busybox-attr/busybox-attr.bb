SUMMARY = "Busybox applets replacing attr"
DESCRIPTION = "This package contains the symlinks to replace attr with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.38.0"

RPM_NAME = "busybox-attr-1.38.0-42.2.noarch.rpm"
RPM_HASH = "bf947f1dee648a3346aa6f08604d591569dfb52ac44262dddab78a64069e0b2e0a797ff3d8cc81c2cff081c6fbaebfe4074a378fb1dcba946334c92f8af5433f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-attr"

RDEPENDS:${PN} += "busybox"

inherit rpm
