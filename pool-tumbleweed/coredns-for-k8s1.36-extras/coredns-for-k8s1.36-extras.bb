SUMMARY = "Extra components for the coredns package"
DESCRIPTION = "Extra components for the coredns package, to make coredns usable in a \
non-containerized environment (man pages, configuration, unit file)."
LICENSE = "Apache-2.0"

PV = "1.14.2"

RPM_NAME = "coredns-for-k8s1.36-extras-1.14.2-1.4.noarch.rpm"
RPM_HASH = "f4296afaea1e9bf8449f14800c768caebe8199d2c9ed11994058180b755e4af58e4cf281fe8977d1597004821e9dff44aaefc3887d1c86194e0ca1ac059cf041"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-coredns-for-k8s1.36-extras \
coredns-extras-for-k8s \
coredns-for-k8s1.36-extras"

RDEPENDS:${PN} += "/usr/bin/sh \
coredns-for-k8s1.36"

inherit rpm
