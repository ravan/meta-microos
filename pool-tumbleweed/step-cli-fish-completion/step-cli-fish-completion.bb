SUMMARY = "Fish completion for step-cli"
DESCRIPTION = "fish shell completions for step-cli."
LICENSE = "Apache-2.0"

PV = "0.30.6"

RPM_NAME = "step-cli-fish-completion-0.30.6-1.3.noarch.rpm"
RPM_HASH = "52d6b624ca216d8bcb82bf05489f23ce4deaa3eb099caf1d3ef8b080a1456665566afbd86b6993182841cf2e4bdad09f4ed88ad3700ca8b8c4e312f7971b93bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "step-cli-fish-completion"

RDEPENDS:${PN} += "fish \
step-cli"

inherit rpm
