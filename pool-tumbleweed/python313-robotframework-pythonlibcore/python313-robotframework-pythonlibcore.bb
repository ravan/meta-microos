SUMMARY = "Tools to ease creating larger test libraries for Robot Framework using Python"
DESCRIPTION = "Tools to ease creating larger test libraries for Robot Framework using Python."
LICENSE = "Apache-2.0"

PV = "4.4.1"

RPM_NAME = "python313-robotframework-pythonlibcore-4.4.1-1.4.noarch.rpm"
RPM_HASH = "ccdf70e03b0fb2e196b01676b10908b1204cd8af1043e2baa66a030ff4a397e6f5fca3410547f518eb58981fe19e3122c3235f7c59cdfff155adc5d910a4bc46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-robotframework-pythonlibcore \
python3.13dist-robotframework-pythonlibcore \
python313-robotframework-pythonlibcore \
python3dist-robotframework-pythonlibcore"

RDEPENDS:${PN} += "python-abi"

inherit rpm
