SUMMARY = "Configuration params via environment variables for forgejo"
DESCRIPTION = "OCI Container users can change arbitrary configuration \
via environment variables with this tool \
 \
Forgejo needs to use an ini file for configuration because the running \
environment that starts the OCI container may not be the same as that used \
by the hooks. An ini file also gives a good default and means that \
users do not have to completely provide a full environment."
LICENSE = "GPL-3.0-or-later"

PV = "16.0.3"

RPM_NAME = "forgejo-environment-to-ini-16.0.3-1.1.aarch64.rpm"
RPM_HASH = "4476718f0fc31d61be42fdddc5b91cc74f72359e5632a37a3252b139bd77348ebcf2f7fdf8177dc352d5f534b3724e6f80c9374916ca2c5fa2f850adcabd6b9e"

RPROVIDES:${PN} += "forgejo-environment-to-ini"

RDEPENDS:${PN} += "forgejo \
libc.so.6"

inherit rpm
