SUMMARY = "Fish completion for github-mcp-server"
DESCRIPTION = "Fish command line completion support for github-mcp-server."
LICENSE = "MIT"

PV = "1.12.1"

RPM_NAME = "github-mcp-server-fish-completion-1.12.1-1.1.noarch.rpm"
RPM_HASH = "d9a16ead420af7e0ca72e05089f09a529527c5a196bf0df90c1a006a85a87434897a7cb3d68cf446db292bf91e48f1e2fe029dec4941be1247b16c42aabe1c5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "github-mcp-server-fish-completion"

RDEPENDS:${PN} += "github-mcp-server"

inherit rpm
