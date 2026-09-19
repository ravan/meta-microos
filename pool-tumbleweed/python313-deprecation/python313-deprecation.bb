SUMMARY = "A library to handle automated deprecations"
DESCRIPTION = "The `deprecation` library provides a `deprecated` decorator and a \
`fail_if_not_removed` decorator for your tests. Together, the two \
enable the automation of several things:"
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "python313-deprecation-2.1.0-4.10.noarch.rpm"
RPM_HASH = "c5e5ace365ab871ad70866243fb3178f18be4e3c79975665999b0b4c16ba092a72c296598ca72546a610695bd6e321047c4d7c12066813eb9d6c1e80e14a3fa1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-deprecation \
python3.13dist-deprecation \
python313-deprecation \
python3dist-deprecation"

RDEPENDS:${PN} += "python-abi \
python313-packaging"

inherit rpm
