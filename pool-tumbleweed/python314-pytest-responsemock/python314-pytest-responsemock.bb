SUMMARY = "Simplified requests calls mocking for pytest"
DESCRIPTION = "Simplified requests calls mocking for pytest."
LICENSE = "BSD-3-Clause"

PV = "1.1.1"

RPM_NAME = "python314-pytest-responsemock-1.1.1-2.5.noarch.rpm"
RPM_HASH = "39b2e95cfb9479ee3e5687172e0786f5c8cf2180c732e84153cfff07e58f7824b629645e673699a3a9d8832be414d3ff76d4ea3e5e19d79c8e43d29997ec2f64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-responsemock \
python314-pytest-responsemock \
python3dist-pytest-responsemock"

RDEPENDS:${PN} += "python-abi \
python314-pytest \
python314-responses"

inherit rpm
