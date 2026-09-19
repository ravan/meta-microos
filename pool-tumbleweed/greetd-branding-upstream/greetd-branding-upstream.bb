SUMMARY = "Upstream branding of greetd"
DESCRIPTION = "This package provides the upstream look and feel for greetd."
LICENSE = "GPL-3.0-only"

PV = "0.10.3"

RPM_NAME = "greetd-branding-upstream-0.10.3-2.8.noarch.rpm"
RPM_HASH = "c88fd48741705dbaf7fb04b7b46a78d1d73ae39ab2ce0116c11af595b3076288c1484ffc1218dbf440c97f2aa67dad2048c73e8aa480ac89e4ff28eb321fc0ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-greetd-branding-upstream \
greetd-branding \
greetd-branding-upstream"

RDEPENDS:${PN} += "greetd \
greetd-agreety \
group-greeter \
user-greeter"

inherit rpm
