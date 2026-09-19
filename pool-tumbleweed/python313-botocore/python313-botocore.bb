SUMMARY = "Python interface for AWS"
DESCRIPTION = "A low-level interface to a growing number of Amazon Web Services."
LICENSE = "Apache-2.0"

PV = "1.43.74"

RPM_NAME = "python313-botocore-1.43.74-1.1.noarch.rpm"
RPM_HASH = "321e39a24b6f0357a1f534497e9dee75b2d8dd90f2404c1989c358e7c7b7027f612ddaff6cf424345c9a674dadf5802dba21077fe2247f3a188855c11d2fea94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-botocore \
python3.13dist-botocore \
python313-botocore \
python3dist-botocore"

RDEPENDS:${PN} += "-python313-jmespath >= 0.7.1 with python313-jmespath < 2.0.0 \
-python313-python-dateutil >= 2.1 with python313-python-dateutil < 3.0.0 \
python-abi \
python313-requests"

inherit rpm
