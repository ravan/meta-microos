SUMMARY = "PolicyKit plugin for connman"
DESCRIPTION = "Provides PolicyKit support for Connman (Connection Manager)."
LICENSE = "GPL-2.0-only"

PV = "1.42"

RPM_NAME = "connman-plugin-polkit-1.42-2.16.aarch64.rpm"
RPM_HASH = "42a120382298e04cfb6127554ca0609ccb9c58b492576337f1a3ca22c692733e3954131fb5d7ff742a518948d52f52657834fcde697c5712b827aa5b786e5c66"

RPROVIDES:${PN} += "connman-plugin-polkit"

RDEPENDS:${PN} += "connman \
dbus-1 \
polkit"

inherit rpm
