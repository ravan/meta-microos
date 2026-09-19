SUMMARY = "Python module to run and analyze benchmarks"
DESCRIPTION = "Python module to run and analyze benchmarks."
LICENSE = "MIT"

PV = "2.10.0"

RPM_NAME = "python313-pyperf-2.10.0-1.3.noarch.rpm"
RPM_HASH = "ac95e150b40c59207f01cf264374ce4c23a62d79a350f4534a6d3bb95e19d39a50d88f96d18f71b5b03f4c6e90d388130a06be1c4d42412918ad7e539bfcc522"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyperf \
python3.13dist-pyperf \
python313-pyperf \
python3dist-pyperf"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
