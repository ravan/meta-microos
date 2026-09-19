SUMMARY = "Extensible schema and data validation tool for Python dictionaries"
DESCRIPTION = "Cerberus provides type checking and other base functionality out of the box and \
is designed to be non-blocking and extensible, allowing for custom \
validation."
LICENSE = "ISC"

PV = "1.3.8"

RPM_NAME = "python313-Cerberus-1.3.8-1.4.noarch.rpm"
RPM_HASH = "18de9125e9d4475e9ac0ff40475a9c4dabbeec1d4eb6983f3bef5f36601e2580f31ad530f3c7a6fa1dbb5adfa1d3068c558a4cf3bc1579f96dbc3ef8bd45352d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Cerberus \
python3.13dist-cerberus \
python313-Cerberus \
python3dist-cerberus"

RDEPENDS:${PN} += "python-abi"

inherit rpm
