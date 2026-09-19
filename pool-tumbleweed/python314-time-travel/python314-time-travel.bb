SUMMARY = "Python time mocking"
DESCRIPTION = "A python library that helps users write deterministic tests for time sensitive and I/O intensive code."
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "python314-time-travel-1.1.2-4.5.noarch.rpm"
RPM_HASH = "bfdd64f6c122016166a0cf13be4a777ea339d8c33d7249785486a66cdbc3a2322f1a36dc710903328f8a256e48f1572865599dc7485d854edcb7d98925c51fb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-time-travel \
python314-time-travel \
python3dist-time-travel"

RDEPENDS:${PN} += "python-abi"

inherit rpm
