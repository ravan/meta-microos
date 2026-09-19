SUMMARY = "Fish Completion for kubernetes1.35-client"
DESCRIPTION = "Fish command line completion support for kubernetes1.35-client."
LICENSE = "Apache-2.0"

PV = "1.35.8"

RPM_NAME = "kubernetes1.35-client-fish-completion-1.35.8-2.1.noarch.rpm"
RPM_HASH = "524e7a9eb7b3fc05d2384bcb947f817099fd9ceeb7019e80854985873493774c146ccbc2790724363fbb93a89ac9f325073db071fe0ed0e1e8ccf757e7334956"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubernetes-client-fish-completion \
kubernetes1.35-client-fish-completion"

RDEPENDS:${PN} += "kubernetes1.35-client"

inherit rpm
