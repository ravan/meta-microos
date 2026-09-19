SUMMARY = "Python utility belt containing simple tools"
DESCRIPTION = "A Python utility belt containing simple tools, a stdlib like feel, and extra batteries"
LICENSE = "Apache-2.0"

PV = "1.4.3"

RPM_NAME = "python313-ubelt-1.4.3-1.1.noarch.rpm"
RPM_HASH = "cfe4583b02fa3228e8969e3aad11890e1cd2e13a0e76e129f9240175a810ee568d6c983141c3c06ce0ec257e2cc751ead9372c377a6ef0f500cbb17f155953a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ubelt \
python3.13dist-ubelt \
python313-ubelt \
python3dist-ubelt"

RDEPENDS:${PN} += "python-abi"

inherit rpm
