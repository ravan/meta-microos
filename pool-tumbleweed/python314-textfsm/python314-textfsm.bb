SUMMARY = "Python module for parsing semi-structured text into python tables"
DESCRIPTION = "Python module which implements a template based state machine for parsing \
semi-formatted text. Originally developed to allow programmatic access to \
information returned from the command line interface (CLI) of networking \
devices."
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "python314-textfsm-2.1.0-2.2.noarch.rpm"
RPM_HASH = "17ae3c705595e69f6557124baf4d2751346610701d423bac01487d4af32a52938cdb985c10ad27f393caeae9221592e6f0129d5de831e6e6fb5291279ae663c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-textfsm \
python314-textfsm \
python3dist-textfsm"

RDEPENDS:${PN} += "python-abi"

inherit rpm
