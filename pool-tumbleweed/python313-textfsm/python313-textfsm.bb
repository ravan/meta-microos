SUMMARY = "Python module for parsing semi-structured text into python tables"
DESCRIPTION = "Python module which implements a template based state machine for parsing \
semi-formatted text. Originally developed to allow programmatic access to \
information returned from the command line interface (CLI) of networking \
devices."
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "python313-textfsm-2.1.0-2.2.noarch.rpm"
RPM_HASH = "3b89beb29c81f9b1df0591229a31b08fb1b4a30c09eb7d3e611073e468f3e8ba85dc59301f096dccb7c79b28d874912ec4e39e3a1df02984bbdd5265d8c4b1c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-textfsm \
python3.13dist-textfsm \
python313-textfsm \
python3dist-textfsm"

RDEPENDS:${PN} += "python-abi"

inherit rpm
