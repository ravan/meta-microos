SUMMARY = "Documentation of tools for basic booting"
DESCRIPTION = "Documentation of helper tools from sysvinit that support booting, including but not exclusive \
to startpar and killproc."
LICENSE = "GPL-2.0-or-later"

PV = "3.14"

RPM_NAME = "sysvinit-tools-doc-3.14-1.7.noarch.rpm"
RPM_HASH = "33aa204d33b48d7d2b1dd9000a1e66ee7e941619607ec09d78ff355b1e845e284a3d9144338eee7441ddd34cdfec39a041665e5c8fa922cf9ffec8ea0d99fe95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sysvinit-tools-doc"

RDEPENDS:${PN} += "sysvinit-tools"

inherit rpm
