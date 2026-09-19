SUMMARY = "AWS authentication for Amazon S3 for the python requests module"
DESCRIPTION = "AWS authentication for Amazon S3 for the Python 'requests' library. \
It is made to work with Python 2.7 and 3. \
At the moment, only S3 is supported."
LICENSE = "BSD-3-Clause"

PV = "0.1.8"

RPM_NAME = "python314-requests-aws-0.1.8-4.5.noarch.rpm"
RPM_HASH = "4713ddfbfc5e1b21acb867724e7c9b80327696bb2eb750a72966afbfaa9cf6d773a68e106021d6fee635d732373173264c1ddcb94b6d61fdffe987f035b6688c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-requests-aws \
python314-requests-aws \
python3dist-requests-aws"

RDEPENDS:${PN} += "python-abi \
python314-requests"

inherit rpm
