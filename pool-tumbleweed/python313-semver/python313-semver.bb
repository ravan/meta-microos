SUMMARY = "Python helper for Semantic Versioning"
DESCRIPTION = "A Python module for semantic versioning. Simplifies comparing versions. \
See also http://semver.org/"
LICENSE = "BSD-3-Clause"

PV = "3.0.4"

RPM_NAME = "python313-semver-3.0.4-3.2.noarch.rpm"
RPM_HASH = "6a069811a562579a3bc7685f0ffa9439218a1fda1c2181d5a9d2dbe775e73ca0f4f19683ba9d4605b152e99c499b9ce3492d61dbab62aaa28d10838489c49aa0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-semver \
python3.13dist-semver \
python313-semver \
python3dist-semver"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
