SUMMARY = "Command Line Interface Formulation Framework"
DESCRIPTION = "Command Line Interface Formulation Framework"
LICENSE = "Apache-2.0"

PV = "4.16.0"

RPM_NAME = "python314-cliff-4.16.0-1.1.noarch.rpm"
RPM_HASH = "2ff92cd694e1d51d1a9a61c8f10bf16f3f55765f3cb6f1bdb5336a525a91b5c9174c6c3bf95d8a5ca3f3c6cb5cb21a80658067420535b1e3590c7ec0794214a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-cliff \
python314-cliff \
python3dist-cliff"

RDEPENDS:${PN} += "python-abi \
python314-PrettyTable \
python314-PyYAML \
python314-autopage \
python314-cmd2 \
python314-stevedore"

inherit rpm
