SUMMARY = "Extends clickGroup to invoke a command without explicit subcommand name"
DESCRIPTION = "Extends click.Group to invoke a command without explicit subcommand name."
LICENSE = "BSD-3-Clause"

PV = "1.2.4"

RPM_NAME = "python314-click-default-group-1.2.4-1.12.noarch.rpm"
RPM_HASH = "41dd53248606e31351c97f028ca0965205df576ac748ff8df8dd0b41e84e295d97dbdfae6924eb75ed8fcd0ea982f4460047ef35ddc1101509d2b70c7207780a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-click-default-group \
python314-click-default-group \
python3dist-click-default-group"

RDEPENDS:${PN} += "python-abi \
python314-click"

inherit rpm
