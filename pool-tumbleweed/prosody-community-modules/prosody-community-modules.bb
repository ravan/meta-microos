SUMMARY = "Community and experimental modules not distributed as part of Prosody"
DESCRIPTION = "Prosody Community Modules are additional modulse not shipped with the \
main Prosody package. These modules are not tested with the main \
server and may be in alpha or beta state. All modules shipped here may \
require additional configuration by the admin."
LICENSE = "MIT"

PV = "0~hg5664"

RPM_NAME = "prosody-community-modules-0~hg5664-1.9.aarch64.rpm"
RPM_HASH = "70294a9504e53202ec8867ab56094cd727d3ace8e80d2552f9967ee1a8ec4cb4e560bf4d9450a66325450087a44c505d90d61b4a9d1e17cff3b0a34105132589"

RPROVIDES:${PN} += "perl-TestConnection \
perl-XMPP--TestUtils \
prosody-community-modules"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
lua54-zlib \
prosody"

inherit rpm
