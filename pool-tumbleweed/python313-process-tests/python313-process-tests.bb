SUMMARY = "Tools for testing processes"
DESCRIPTION = "Testcase classes and assertions for testing processes."
LICENSE = "BSD-2-Clause"

PV = "3.0.0"

RPM_NAME = "python313-process-tests-3.0.0-2.5.noarch.rpm"
RPM_HASH = "b3a6fcb8c470b0de0a18b9e95e98aa185978386da44dfff77926c2c484900aef8750434000b6774f3ea552bc5194060e4f218a4a2e2f01c139bcda3e41656ec3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-process-tests \
python3.13dist-process-tests \
python313-process-tests \
python3dist-process-tests"

RDEPENDS:${PN} += "python-abi"

inherit rpm
