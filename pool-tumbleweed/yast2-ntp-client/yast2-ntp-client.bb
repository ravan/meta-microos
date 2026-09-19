SUMMARY = "YaST2 - NTP Client Configuration"
DESCRIPTION = "This package contains the YaST2 component for NTP client configuration."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.2"

RPM_NAME = "yast2-ntp-client-5.0.2-1.1.noarch.rpm"
RPM_HASH = "c25aed3b28bf030c81f3bc0b78ac0a0a2448e1b1ae96d466203cacebf5a0322424860a62ca197d92bc7780869aacc81327f487ebe0e7080619fd40a34b8deb51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-ntp-client"

RDEPENDS:${PN} += "/usr/bin/sh \
augeas-lenses \
rubygem-ruby-4.0.0-cfa \
systemd \
yast2 \
yast2-country-data \
yast2-network \
yast2-ruby-bindings"

inherit rpm
