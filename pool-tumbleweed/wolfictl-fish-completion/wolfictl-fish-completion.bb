SUMMARY = "Fish Completion for wolfictl"
DESCRIPTION = "Fish command line completion support for wolfictl."
LICENSE = "Apache-2.0"

PV = "0.39.25"

RPM_NAME = "wolfictl-fish-completion-0.39.25-1.1.noarch.rpm"
RPM_HASH = "7eaf08efe8934ade17f8d3e90c60e478c098d9947290125c939e5b2a6cfa7fed335cd6e8bd573b42dc64964229fee0ff5ca30d03bab17e3de9eb96df67e5ea18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wolfictl-fish-completion"

RDEPENDS:${PN} += "wolfictl"

inherit rpm
