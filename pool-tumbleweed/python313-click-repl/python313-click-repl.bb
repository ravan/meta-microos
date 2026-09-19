SUMMARY = "REPL plugin for Click"
DESCRIPTION = "REPL plugin for Click"
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python313-click-repl-0.3.0-3.2.noarch.rpm"
RPM_HASH = "654f6bb805001b62e6546fc6d6bb8d21a65aec217f6e6fbf60e5039a3a3054ed1aec17a6d9a83a87221a766495c8c4fa6a9d79d67d8181dc2a55b23b44b9650a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-click-repl \
python3.13dist-click-repl \
python313-click-repl \
python3dist-click-repl"

RDEPENDS:${PN} += "python-abi \
python313-click \
python313-prompt-toolkit"

inherit rpm
