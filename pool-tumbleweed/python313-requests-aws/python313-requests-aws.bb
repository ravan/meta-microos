SUMMARY = "AWS authentication for Amazon S3 for the python requests module"
DESCRIPTION = "AWS authentication for Amazon S3 for the Python 'requests' library. \
It is made to work with Python 2.7 and 3. \
At the moment, only S3 is supported."
LICENSE = "BSD-3-Clause"

PV = "0.1.8"

RPM_NAME = "python313-requests-aws-0.1.8-4.5.noarch.rpm"
RPM_HASH = "ec6ebc258e56d71d4304f88423351163a5a585854fd03989a25ae492e3b114aa2fbbda6ef4c26c9284f1fc2a5f6834b4fa2791337e6ee17c8bba4e061928a7d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requests-aws \
python3.13dist-requests-aws \
python313-requests-aws \
python3dist-requests-aws"

RDEPENDS:${PN} += "python-abi \
python313-requests"

inherit rpm
