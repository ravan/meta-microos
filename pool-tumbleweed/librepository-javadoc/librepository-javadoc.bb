SUMMARY = "Javadoc for librepository"
DESCRIPTION = "Javadoc for librepository."
LICENSE = "LGPL-2.0-only"

PV = "1.1.6"

RPM_NAME = "librepository-javadoc-1.1.6-2.9.noarch.rpm"
RPM_HASH = "94007b45131ecd25ec92ba2f6dd6f5f4bf5edd0a0bc34dd15c4dafaef3cb6f56fff685a7a6482ddd3d3621dff88997491de62500913f261ffed21a594e464da6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "librepository-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
