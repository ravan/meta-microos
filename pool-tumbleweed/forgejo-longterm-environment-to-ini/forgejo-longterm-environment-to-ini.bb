SUMMARY = "Configuration params via environment variables for forgejo-longterm"
DESCRIPTION = "OCI Container users can change arbitrary configuration \
via environment variables with this tool \
 \
Forgejo needs to use an ini file for configuration because the running \
environment that starts the OCI container may not be the same as that used \
by the hooks. An ini file also gives a good default and means that \
users do not have to completely provide a full environment."
LICENSE = "GPL-3.0-or-later"

PV = "15.0.6"

RPM_NAME = "forgejo-longterm-environment-to-ini-15.0.6-1.1.aarch64.rpm"
RPM_HASH = "d25eeb1aa13f552653e10b58527e39f51bd56e05cd54fd89a0b070ea0f4312edfba2b2b31a5c32fcf1e211b8989bb77474b3193aa3f9c9a24a49b6cc966154d7"

RPROVIDES:${PN} += "forgejo-longterm-environment-to-ini"

RDEPENDS:${PN} += "forgejo-longterm \
libc.so.6"

inherit rpm
