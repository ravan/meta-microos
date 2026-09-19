SUMMARY = "Python interface for AWS"
DESCRIPTION = "A low-level interface to a growing number of Amazon Web Services."
LICENSE = "Apache-2.0"

PV = "1.43.74"

RPM_NAME = "python314-botocore-1.43.74-1.1.noarch.rpm"
RPM_HASH = "5e1962b500280c756d67e9517a701a73b3048b2c08407e8ecdf16bfccecdcd45e9e488c071c5da3a43c3c0def4dd603fad1439325f6b60870b0bf08e5da9c77f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-botocore \
python314-botocore \
python3dist-botocore"

RDEPENDS:${PN} += "-python314-jmespath >= 0.7.1 with python314-jmespath < 2.0.0 \
-python314-python-dateutil >= 2.1 with python314-python-dateutil < 3.0.0 \
python-abi \
python314-requests"

inherit rpm
