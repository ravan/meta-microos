SUMMARY = "Extends clickGroup to invoke a command without explicit subcommand name"
DESCRIPTION = "Extends click.Group to invoke a command without explicit subcommand name."
LICENSE = "BSD-3-Clause"

PV = "1.2.4"

RPM_NAME = "python313-click-default-group-1.2.4-1.12.noarch.rpm"
RPM_HASH = "e910e8ee70366d0005767f639cc7dbc7cac4ea8335051b3cfc45d64df316681f272b929c25c978791a4a730f4fd0c9a1ceedbb352e9d620b3018062446ded248"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-click-default-group \
python3.13dist-click-default-group \
python313-click-default-group \
python3dist-click-default-group"

RDEPENDS:${PN} += "python-abi \
python313-click"

inherit rpm
