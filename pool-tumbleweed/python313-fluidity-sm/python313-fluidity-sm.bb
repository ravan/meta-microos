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

RPM_NAME = "python313-fluidity-sm-0.2.0-4.5.noarch.rpm"
RPM_HASH = "c8b6ee8154b1a98d136a165e0e164e8f07830d7d527d4c333d0fecd4ffbc60f9ffe44a3498d8575b84d9dc84e09dab5e454a1479d2eb74f53ebc9be9687951d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fluidity-sm \
python3.13dist-fluidity-sm \
python313-fluidity-sm \
python3dist-fluidity-sm"

RDEPENDS:${PN} += "python-abi"

inherit rpm
