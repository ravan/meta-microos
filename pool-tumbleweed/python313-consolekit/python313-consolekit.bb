SUMMARY = "Additional utilities for click"
DESCRIPTION = "Additional utilities for click."
LICENSE = "MIT"

PV = "1.13.0"

RPM_NAME = "python313-consolekit-1.13.0-2.2.noarch.rpm"
RPM_HASH = "2a84b68375241ff11df538d815e699e0b31af8b1ef830de2ade5b7a1c65254eb6160d7461cc3ccdb166065cc4dd6103b8d18c4b14dde8cf27d86531978bd00e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-consolekit \
python3.13dist-consolekit \
python313-consolekit \
python3dist-consolekit"

RDEPENDS:${PN} += "python-abi \
python313-click \
python313-deprecation-alias \
python313-domdf-python-tools \
python313-mistletoe \
python313-typing-extensions"

inherit rpm
