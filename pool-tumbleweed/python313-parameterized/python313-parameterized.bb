SUMMARY = "Parameterized testing"
DESCRIPTION = "Parameterized testing with any Python test framework."
LICENSE = "BSD-2-Clause"

PV = "0.9.0"

RPM_NAME = "python313-parameterized-0.9.0-5.5.noarch.rpm"
RPM_HASH = "76a210a29d0d9ff4ea5a9b6e4aee7d85a4b140bd91ed8542842ba3e01b7d892b035ef17dc9831858744583a680a3d010f1b5446f46a7bf3bd4e0861bf9135594"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-parameterized \
python3.13dist-parameterized \
python313-parameterized \
python3dist-parameterized"

RDEPENDS:${PN} += "python-abi"

inherit rpm
