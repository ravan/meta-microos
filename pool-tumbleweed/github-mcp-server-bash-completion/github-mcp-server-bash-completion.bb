SUMMARY = "Bash completion for github-mcp-server"
DESCRIPTION = "Bash command line completion support for github-mcp-server."
LICENSE = "MIT"

PV = "1.12.1"

RPM_NAME = "github-mcp-server-bash-completion-1.12.1-1.1.noarch.rpm"
RPM_HASH = "2719d7a891de6c4cc960ab2871aab7476e6c82f4aba6736fcd75bd7bf55f9c9f9cee0f69787e6252726c3cee0a9f9765a2ceabb1f1436c6f31927f7fadc9d7b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "github-mcp-server-bash-completion"

RDEPENDS:${PN} += "bash-completion \
github-mcp-server"

inherit rpm
