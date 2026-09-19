SUMMARY = "Fish Completion for kubernetes1.37-client"
DESCRIPTION = "Fish command line completion support for kubernetes1.37-client."
LICENSE = "Apache-2.0"

PV = "1.37.0"

RPM_NAME = "kubernetes1.37-client-fish-completion-1.37.0-1.1.noarch.rpm"
RPM_HASH = "be5f6ae745bbdb1ed1cb8accc7a27186c0e512906b0b34c098ae79602d5a664dcc7212e9dacaa9acf5e1a698ef14163e2db577bd282c13c7883e2d3643265523"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubernetes-client-fish-completion \
kubernetes1.37-client-fish-completion"

RDEPENDS:${PN} += "kubernetes1.37-client"

inherit rpm
