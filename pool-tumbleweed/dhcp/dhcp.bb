SUMMARY = "Common Files Used by ISC DHCP Software"
DESCRIPTION = "This package contains common programs used by both the ISC DHCP \
server ('dhcp-server' package) and client ('dhcp-client') as the \
omshell and common manual pages."
LICENSE = "MPL-2.0"

PV = "4.4.3.P1"

RPM_NAME = "dhcp-4.4.3.P1-1.2.aarch64.rpm"
RPM_HASH = "d0eb39802b21d8376e310d1e39b1ffabf20e9b6c49cb57a38077e5d0dce73106ba4a100a572ef27ff2ccfb60a46955de89242d8b077faf298e17f6a19b807193"

RPROVIDES:${PN} += "dhcp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
