SUMMARY = "Apparmor profile for forgejo"
DESCRIPTION = "This package adds the Apparmor profile to forgejo"
LICENSE = "GPL-3.0-or-later"

PV = "16.0.3"

RPM_NAME = "forgejo-apparmor-16.0.3-1.1.noarch.rpm"
RPM_HASH = "82b36c5e70ba9e369618f5e5f7b3f6b87e351b42bf6728c7882aa02e2e4ed9f3c143f131c0a90d06b953958c7e331ea56a9e2f670fc448078ed8ef397d3302bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-forgejo-apparmor \
forgejo-apparmor"

RDEPENDS:${PN} += "/usr/bin/sh \
forgejo"

inherit rpm
