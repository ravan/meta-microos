SUMMARY = "A python library adding a json log formatter"
DESCRIPTION = "A python library adding a json log formatter."
LICENSE = "BSD-2-Clause"

PV = "4.1.0"

RPM_NAME = "python314-python-json-logger-4.1.0-1.2.noarch.rpm"
RPM_HASH = "fce852829e48dc8d21427f899cfcf2ba5eb3b82d93aa417b9df1b9abb2e5c3b21aec6a181b6a0b0aa557ca3355dc999a530673ba5bda703f669afbdf9a2ee35a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-json-logger \
python314-python-json-logger \
python3dist-python-json-logger"

RDEPENDS:${PN} += "python-abi"

inherit rpm
