SUMMARY = "Extra components for the coredns package"
DESCRIPTION = "Extra components for the coredns package, to make coredns usable in a \
non-containerized environment (man pages, configuration, unit file)."
LICENSE = "Apache-2.0"

PV = "1.12.1"

RPM_NAME = "coredns-for-k8s1.34-extras-1.12.1-2.7.noarch.rpm"
RPM_HASH = "4ff3ebfcf0275ea0cf92b13e96dd0d75705d6a519d3d6eb7d451349f548f2653820d5fe21c9bd540c15b8f65952b61f40dcc4c89911e442eb220239c06620a05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-coredns-for-k8s1.34-extras \
coredns-extras-for-k8s \
coredns-for-k8s1.34-extras"

RDEPENDS:${PN} += "/usr/bin/sh \
coredns-for-k8s1.34"

inherit rpm
