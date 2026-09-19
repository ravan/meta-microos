SUMMARY = "Agent for the WoodpeckerCI system"
DESCRIPTION = "Woodpecker is a simple yet powerful CI/CD engine with great extensibility. This \
package contains the agent binary and service."
LICENSE = "Apache-2.0"

PV = "3.18.0"

RPM_NAME = "woodpecker-agent-3.18.0-1.1.aarch64.rpm"
RPM_HASH = "5a44ca010ea4ae05b356efd83aea3e43a2f11ff1cd0eece75058c8ddd8be4481927e54ce5f808d4c2c574414cc861225669c9a45d11150aff8af7f0ed13f3c5f"

RPROVIDES:${PN} += "config-woodpecker-agent \
woodpecker-agent"

RDEPENDS:${PN} += "/usr/bin/sh \
group-woodpecker \
libc.so.6 \
user-woodpecker"

inherit rpm
