SUMMARY = "State machine implementation for Python objects"
DESCRIPTION = "State machine implementation for Python objects. \
 \
A Fluidity state machine must have one initial state and at least two states. \
 \
A state may have enter and exit callbacks, for running some code on state enter \
and exit, respectively. These params can be method names (as strings), \
callables, or lists of method names or callables."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python314-fluidity-sm-0.2.0-4.5.noarch.rpm"
RPM_HASH = "dfc9feab2a96310e96df62a454382eb5e2d6ca0a9ac9fb66c0eee8b9fe025dd03b966aa8c255f15b85d60b057b5056d05fda09214a7f8d193d7b5a02c5fc6a61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-fluidity-sm \
python314-fluidity-sm \
python3dist-fluidity-sm"

RDEPENDS:${PN} += "python-abi"

inherit rpm
