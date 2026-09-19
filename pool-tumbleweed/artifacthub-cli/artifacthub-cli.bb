SUMMARY = "CLI for Artifact Hub"
DESCRIPTION = "Artifact Hub includes a command line interface tool named ah. You can check \
that your packages are ready to be listed on AH by using the lint subcommand. \
 \
Integrating the linter into your CI workflow may help catching errors early."
LICENSE = "Apache-2.0"

PV = "1.23.0"

RPM_NAME = "artifacthub-cli-1.23.0-1.2.aarch64.rpm"
RPM_HASH = "f264dfa636c2dde5c5bb7952d4643c2820a43d30d7d6defba3a1ab899b2736fc42d15e36f0835b0082f3b2595e0baab852a2590f8ad23a05e405b8714095dedd"

RPROVIDES:${PN} += "ah \
artifacthub-cli"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
