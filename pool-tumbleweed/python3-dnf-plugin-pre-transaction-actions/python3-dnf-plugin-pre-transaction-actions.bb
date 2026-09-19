SUMMARY = "Pre transaction actions Plugin for DNF"
DESCRIPTION = "Pre transaction actions Plugin for DNF, Python 3 version. Plugin runs actions \
(shell commands) before transaction is completed. Actions are defined in action \
files."
LICENSE = "GPL-2.0-or-later"

PV = "4.10.1"

RPM_NAME = "python3-dnf-plugin-pre-transaction-actions-4.10.1-1.6.noarch.rpm"
RPM_HASH = "064305391a1428cf08958ddc5a65801f03011024e46fcd705c6e0aee8c25dc16150bd46c83367dd753878092325beb4b56d3796aa6bd7f04c031431197247159"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-python3-dnf-plugin-pre-transaction-actions \
dnf-plugin-pre-transaction-actions \
python3-dnf-plugin-pre-transaction-actions"

RDEPENDS:${PN} += "python-abi \
python3-dnf-plugins-core"

inherit rpm
