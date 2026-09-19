SUMMARY = "Development header for GSSAPI NTLMSSP"
DESCRIPTION = "A header file with definitions for custom GSSAPI extensions for NTLMSSP."
LICENSE = "ISC"

PV = "1.3.1"

RPM_NAME = "gssntlmssp-devel-1.3.1-1.3.aarch64.rpm"
RPM_HASH = "0e506e5d4e6ed9f9ce5ca504ec241ff6aea84dc887fbe7e95544f3aed507704702d40ad334d32bed6898ee21b2bdd3ba872f4c7ec4c8ea8b001b0c42dc863bcd"

RPROVIDES:${PN} += "gssntlmssp-devel"

RDEPENDS:${PN} += "gssntlmssp"

inherit rpm
