SUMMARY = "Component for salt that enables controlling arbitrary devices"
DESCRIPTION = "Proxy minions are a developing Salt feature that enables controlling devices that, \
for whatever reason, cannot run a standard salt-minion. \
Examples include network gear that has an API but runs a proprietary OS, \
devices with limited CPU or memory, or devices that could run a minion, but for \
security reasons, will not."
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-proxy-3006.0-70.1.aarch64.rpm"
RPM_HASH = "5f47faa3e386e493b55f8f8cd411c2305d9495c49f22b9001d96bc76cf2e1bc69891d53ee5da43f9b58a96eb80bfb23d1fad7c989c9bf563abc6995adff18873"

RPROVIDES:${PN} += "salt-proxy"

RDEPENDS:${PN} += "/usr/bin/sh \
salt \
systemd"

inherit rpm
