SUMMARY = "Extra components for the coredns package"
DESCRIPTION = "Extra components for the coredns package, to make coredns usable in a \
non-containerized environment (man pages, configuration, unit file)."
LICENSE = "Apache-2.0"

PV = "1.13.1"

RPM_NAME = "coredns-for-k8s1.35-extras-1.13.1-2.7.noarch.rpm"
RPM_HASH = "7591309295c8af2ca6fc7e5551b77a701fe59451cdb29c57928af826ba05712d8191c1d25d7b2910e857fad1ba32b3c19e82befbe772c9fdd532c827b896ab62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-coredns-for-k8s1.35-extras \
coredns-extras-for-k8s \
coredns-for-k8s1.35-extras"

RDEPENDS:${PN} += "/usr/bin/sh \
coredns-for-k8s1.35"

inherit rpm
