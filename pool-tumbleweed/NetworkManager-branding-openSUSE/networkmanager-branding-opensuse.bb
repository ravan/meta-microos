SUMMARY = "Default openSUSE branding for NetworkManager configuration file"
DESCRIPTION = "NetworkManager attempts to keep an active network connection available \
at all times.  The point of NetworkManager is to make networking \
configuration and setup as painless and automatic as possible.	If \
using DHCP, NetworkManager is intended to replace default routes, \
obtain IP addresses from a DHCP server, and change name servers \
whenever it sees fit. \
 \
This package provides the default openSUSE configuration for \
/usr/lib/NetworkManager/conf.d/conncheck.conf, configured to \
check connectivity against http://conncheck.opensuse.org."
LICENSE = "GPL-2.0-or-later"

PV = "42.1"

RPM_NAME = "NetworkManager-branding-openSUSE-42.1-7.20.noarch.rpm"
RPM_HASH = "6a0ce3431b16b4adb4be6f4a98b7a6b1812c2e2ad2c4137cb333caf98f38d08f4b6caa4b8f13969b075ab1b8d07faa20c36a6e25017792d1b6728dbd21c66e3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "NetworkManager-branding \
NetworkManager-branding-openSUSE"

RDEPENDS:${PN} += "NetworkManager"

inherit rpm
