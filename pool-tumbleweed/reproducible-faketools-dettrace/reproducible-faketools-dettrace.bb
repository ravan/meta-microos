SUMMARY = "use dettrace to normalize env"
DESCRIPTION = "a script to enhance the reproducibility of the output \
by ptraceing in a container"
LICENSE = "MIT"

PV = "0.5.5+0"

RPM_NAME = "reproducible-faketools-dettrace-0.5.5+0-1.7.noarch.rpm"
RPM_HASH = "ad8f390553c831b13a71be7c1afeb8c4c65935066cd5e1c840d56afd68a7f7a3f70537b106ced31d72412f52c4a6383a71f77b44aed32e6bea3487e9755fc670"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "reproducible-faketools-dettrace"

RDEPENDS:${PN} += "reproducible-faketools-rpmbuild"

inherit rpm
