SUMMARY = "Pure Python Expect-like module"
DESCRIPTION = "Pexpect is a pure Python module for spawning child applications; \
controlling them; and responding to expected patterns in their output."
LICENSE = "ISC"

PV = "4.9.0"

RPM_NAME = "python314-pexpect-4.9.0-5.1.noarch.rpm"
RPM_HASH = "b7ec614f2d3db2eeb821d5c1cadfc4df7a0ed088fa2966c8ba095188c9f8cfcea60451a96731465ff225644a3e71e6a1dfe33814587bb55f3b7bf510123542ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pexpect \
python314-pexpect \
python3dist-pexpect"

RDEPENDS:${PN} += "python-abi \
python314-ptyprocess"

inherit rpm
