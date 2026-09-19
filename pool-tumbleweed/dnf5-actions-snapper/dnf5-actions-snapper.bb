SUMMARY = "A plugin for dnf5 to create snapper plugins"
DESCRIPTION = "This plugin allows DNF5 to create snapper plugins \
before and after every transaction like zypper would do."
LICENSE = "GPL-2.0-or-later"

PV = "0.1"

RPM_NAME = "dnf5-actions-snapper-0.1-1.2.noarch.rpm"
RPM_HASH = "f091059367634588f69bf47b9028aff259a1fc05b78f61ca05719491caf97ac15559088234320ce95fc06229ac66cc27d7f39850a4bcc1f3e24950c71c16f728"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dnf5-actions-snapper"

RDEPENDS:${PN} += "dnf5 \
libdnf5-plugin-actions \
snapper"

inherit rpm
