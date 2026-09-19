SUMMARY = "Busybox applets not fitting anywhere else"
DESCRIPTION = "This package contains the symlinks to provide various busybox applets which \
do not fit really to any other package."
LICENSE = "GPL-2.0-or-later"

PV = "1.38.0"

RPM_NAME = "busybox-misc-1.38.0-42.2.noarch.rpm"
RPM_HASH = "f61d221f8522fd5051a577c557458af16d6ce74eff9175a9adde6bfcea3a6db6b67ab0abc3a39410bed35b37df7b71c06ac7e8ecdf8ad62f735642b03f9a535b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-misc"

RDEPENDS:${PN} += "busybox"

inherit rpm
