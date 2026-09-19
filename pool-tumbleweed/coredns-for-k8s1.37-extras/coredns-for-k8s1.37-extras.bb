SUMMARY = "Extra components for the coredns package"
DESCRIPTION = "Extra components for the coredns package, to make coredns usable in a \
non-containerized environment (man pages, configuration, unit file)."
LICENSE = "Apache-2.0"

PV = "1.14.6"

RPM_NAME = "coredns-for-k8s1.37-extras-1.14.6-1.1.noarch.rpm"
RPM_HASH = "019b40f44a34e6d000ec4870d940ccbddd83a1f7eb5a2a9cf62978f7b847908180093b8f1993ad812a12297725fd47b7c88ead48e6715482892a41bff1147a0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-coredns-for-k8s1.37-extras \
coredns-extras-for-k8s \
coredns-for-k8s1.37-extras"

RDEPENDS:${PN} += "/usr/bin/sh \
coredns-for-k8s1.37"

inherit rpm
