SUMMARY = "Friendly state machines for python"
DESCRIPTION = "Friendly state machines for python."
LICENSE = "Apache-2.0"

PV = "3.5.0"

RPM_NAME = "python314-automaton-3.5.0-1.1.noarch.rpm"
RPM_HASH = "82ac662f97021c500dd5c01712691d1d822c44e8be8d6b5acb9bd1efb33b6582633435b87b69d4a21f92fbf92e7d4bcce172c9ba06696e787c6257a79f641831"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-automaton \
python314-automaton \
python3dist-automaton"

RDEPENDS:${PN} += "python-abi \
python314-PrettyTable \
python314-pbr \
python314-typing-extensions"

inherit rpm
