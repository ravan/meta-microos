SUMMARY = "Apparmor profile for forgejo-longterm"
DESCRIPTION = "This package adds the Apparmor profile to forgejo-longterm"
LICENSE = "GPL-3.0-or-later"

PV = "15.0.6"

RPM_NAME = "forgejo-longterm-apparmor-15.0.6-1.1.noarch.rpm"
RPM_HASH = "8fada3ee7e4958558ae39bc725a245fd221ae51ca81f31a9541d0f37a7d5f3043cd48ed2db5277ce818a8723508a1b41071c05782ef2e79183a3cc7ae9754685"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-forgejo-longterm-apparmor \
forgejo-longterm-apparmor"

RDEPENDS:${PN} += "/usr/bin/sh \
forgejo-longterm"

inherit rpm
