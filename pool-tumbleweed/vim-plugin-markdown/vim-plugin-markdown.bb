SUMMARY = "Markdown support for vim"
DESCRIPTION = "Syntax highlighting, matching rules and mappings for the original Markdown and \
extensions."
LICENSE = "MIT"

PV = "2.0.0+20251022"

RPM_NAME = "vim-plugin-markdown-2.0.0+20251022-64.2.noarch.rpm"
RPM_HASH = "d8b2c5cd2f5c231dc8688e55958a7dd730ac54fb58c57af0df8fe2a7a6a1e120470c903135e85c6bdcbe20aa4a1a11f9945ad6cdc9c9391974188110b2e68776"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-markdown"

RDEPENDS:${PN} += "/usr/bin/sh \
vim"

inherit rpm
