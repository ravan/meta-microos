SUMMARY = "Find a connected eth interface and create an ifcfg for it"
DESCRIPTION = "All available Ethernet network interfaces will be cycled \
until one is successfully configured. \
This script should run at the first boot of a machine \
that has several interfaces."
LICENSE = "MIT"

PV = "1.0"

RPM_NAME = "network-autoconfig-1.0-4.19.noarch.rpm"
RPM_HASH = "0812d08aecf077d3f3562b27db772d46ada6bb0d66958d301764149bc292844bd543fc98dfd90eb23aae152b79d053706f20840152a69d942338033cf3512045"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "network-autoconfig"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
systemd \
wicked"

inherit rpm
