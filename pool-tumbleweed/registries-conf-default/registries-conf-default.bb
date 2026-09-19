SUMMARY = "Add SUSE and openSUSE registries to be used to pull images along with dockerhub"
DESCRIPTION = "Ships the upstream registries.conf with registry.opensuse.org and registry.suse.com as additional unqualified search registries."
LICENSE = "Apache-2.0"

PV = "20260521"

RPM_NAME = "registries-conf-default-20260521-1.1.noarch.rpm"
RPM_HASH = "6e971e047981bc006a5dab028f6a8b8a1f0c046994645c4c109fd22051fc673449e16794866df0582455e0db327ee7c4b8868f6e09ba1391cb01afb992d20ea5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "registries-conf \
registries-conf-default"

RDEPENDS:${PN} += ""

inherit rpm
