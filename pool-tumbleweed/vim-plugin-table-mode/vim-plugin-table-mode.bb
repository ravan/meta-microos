SUMMARY = "VIM Table Mode for instant table creation."
DESCRIPTION = "An awesome automatic table creator & formatter allowing one to \
create neat tables as you type."
LICENSE = "MIT"

PV = "4.8.1"

RPM_NAME = "vim-plugin-table-mode-4.8.1-64.2.noarch.rpm"
RPM_HASH = "f6754dcd146959705e4be9f0a86f536aac6aeda5fa14434274cda4d714f659851d21b313418c27d2d36afa4d50743c76a616595095e8112f309a3474dec298da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-table-mode"

RDEPENDS:${PN} += "/usr/bin/sh \
vim"

inherit rpm
