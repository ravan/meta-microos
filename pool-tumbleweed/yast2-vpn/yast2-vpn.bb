SUMMARY = "A YaST module for configuring VPN gateway and clients"
DESCRIPTION = "A YaST module for managing VPN gateway and client connections to secure site-to-site communication via IPSec VPN."
LICENSE = "GPL-2.0-only"

PV = "5.0.1"

RPM_NAME = "yast2-vpn-5.0.1-1.2.noarch.rpm"
RPM_HASH = "0afe3414a3748fc5f4df2a02a40495370e6debbd60a70282d7717cc84adb916fb0ceffc071bd5749d9a6ec6bb97fdfcbabac698cfbd336918859dcdf9bd9dc42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-vpn"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/touch \
fillup \
yast2 \
yast2-ruby-bindings"

inherit rpm
