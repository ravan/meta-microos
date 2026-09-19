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

RPM_NAME = "python313-expandvars-1.1.2-1.5.noarch.rpm"
RPM_HASH = "34af408795ffb440fd695612aac64ef4987d688fdd7f0a77cf093bdb5f513ae5f6ad03dd19985bd42b508986bf8c43672cd99e49aaee90abfa1907cd6d102b37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-expandvars \
python3.13dist-expandvars \
python313-expandvars \
python3dist-expandvars"

RDEPENDS:${PN} += "python-abi"

inherit rpm
