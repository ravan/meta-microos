SUMMARY = "Tools to ease creating larger test libraries for Robot Framework using Python"
DESCRIPTION = "Tools to ease creating larger test libraries for Robot Framework using Python."
LICENSE = "Apache-2.0"

PV = "4.4.1"

RPM_NAME = "python314-robotframework-pythonlibcore-4.4.1-1.4.noarch.rpm"
RPM_HASH = "04f269fbc9d2c90f57c5fa599334346ad5c907da76922ce8a5f9a4a1f28e831eac09faa1a3ccceccd3c813eb1336ce39206d1276548e5a80728fc4b269d75fd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-robotframework-pythonlibcore \
python314-robotframework-pythonlibcore \
python3dist-robotframework-pythonlibcore"

RDEPENDS:${PN} += "python-abi"

inherit rpm
