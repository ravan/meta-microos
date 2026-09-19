SUMMARY = "CLI for the WoodpeckerCI system"
DESCRIPTION = "Woodpecker is a simple yet powerful CI/CD engine with great extensibility. This \
package contains the command line utility for the WoodpeckerCI system"
LICENSE = "Apache-2.0"

PV = "3.18.0"

RPM_NAME = "woodpecker-cli-3.18.0-1.1.aarch64.rpm"
RPM_HASH = "1ee7d6c932ed00d684ca30402625a21e004fa683dc042124d91a8118bfc74710ef069657a782e40e236889b796735fd0fc0029267d6aef4b57cee3eb46acf389"

RPROVIDES:${PN} += "woodpecker-cli"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
