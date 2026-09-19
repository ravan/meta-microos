SUMMARY = "Fish Completion for kubernetes1.34-client"
DESCRIPTION = "Fish command line completion support for kubernetes1.34-client."
LICENSE = "Apache-2.0"

PV = "1.34.11"

RPM_NAME = "kubernetes1.34-client-fish-completion-1.34.11-2.1.noarch.rpm"
RPM_HASH = "74c0141f519f015f9948ca550bf4530bb02a502f423e42d839f6104d1addae35c2074ca90b5020e76058857948a85486aeca110574ac57b1a8c21adf0ba5a0b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubernetes-client-fish-completion \
kubernetes1.34-client-fish-completion"

RDEPENDS:${PN} += "kubernetes1.34-client"

inherit rpm
