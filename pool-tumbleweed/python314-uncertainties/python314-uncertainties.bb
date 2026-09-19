SUMMARY = "Uncertainties on the Quantities Involved (aka 'Error Propagation')"
DESCRIPTION = "'uncertainties' allows calculations such as (2±0.1)*2 = 4±0.2 to be \
performed transparently. Much more complex mathematical expressions \
involving numbers with uncertainties can also be evaluated directly."
LICENSE = "BSD-3-Clause"

PV = "3.2.3"

RPM_NAME = "python314-uncertainties-3.2.3-1.5.noarch.rpm"
RPM_HASH = "7336f687c668cb811496a6933d53e1257fd11af5874cb84ff82c8ae3c20ddbc41401bf93371eec1eb7a5718245193a25d584d3b4e68a4ac31391150acce88133"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-uncertainties \
python314-uncertainties \
python3dist-uncertainties"

RDEPENDS:${PN} += "python-abi"

inherit rpm
