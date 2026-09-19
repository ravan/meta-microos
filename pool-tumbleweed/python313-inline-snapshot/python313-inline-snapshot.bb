SUMMARY = "Create and update inline snapshots in your Python code"
DESCRIPTION = "Create and update inline snapshots in your Python code."
LICENSE = "MIT"

PV = "0.35.4"

RPM_NAME = "python313-inline-snapshot-0.35.4-1.1.noarch.rpm"
RPM_HASH = "2961e9d2bb59ed481621231cd0bb3c59da16f2be766895d88d815779157c77ac1ab2fc68f1edfc54c4aeabb0c53573bd98e771bbbcb1f18e326235ce0bf17a89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-inline-snapshot \
python3.13dist-inline-snapshot \
python313-inline-snapshot \
python3dist-inline-snapshot"

RDEPENDS:${PN} += "python-abi \
python313-asttokens \
python313-executing \
python313-pytest \
python313-rich \
python313-typing-extensions"

inherit rpm
