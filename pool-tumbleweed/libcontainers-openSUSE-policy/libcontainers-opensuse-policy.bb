SUMMARY = "Policy to enforce image verification for SLE BCI"
DESCRIPTION = "This package ships a /usr/share/containers/policy.json which enforces image verification for SLE BCI."
LICENSE = "Apache-2.0"

PV = "20260521"

RPM_NAME = "libcontainers-openSUSE-policy-20260521-1.1.noarch.rpm"
RPM_HASH = "5d308959ea30541aee941660b65937b3d62113c6e75ad836c8fc896d9f368476b7e4f67db96efad2e96ab9be6dedbaffce8eb4eecd32ada3f3a1180c61bb83bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libcontainers-openSUSE-policy \
libcontainers-policy"

RDEPENDS:${PN} += ""

inherit rpm
