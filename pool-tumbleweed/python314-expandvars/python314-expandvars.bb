SUMMARY = "Expand system variables Unix style"
DESCRIPTION = "Expand system variables Unix style \
 \
This module is inspired by [GNU bash's variable expansion \
features](https://www.gnu.org/software/bash/manual/html_node/Shell-Parameter-Expansion.html). \
It can be used as an alternative to Python's \
[os.path.expandvars](https://docs.python.org/3/library/os.path.html#os.path.expandvars) \
function."
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "python314-expandvars-1.1.2-1.5.noarch.rpm"
RPM_HASH = "b30d34d0122841eea925b13892f354dcc210326def499dc3e08e5179f0b9e4b98db789575254c0a075b71bf6b658d695dccc67bfcce79f664b2568c9a162ce08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-expandvars \
python314-expandvars \
python3dist-expandvars"

RDEPENDS:${PN} += "python-abi"

inherit rpm
