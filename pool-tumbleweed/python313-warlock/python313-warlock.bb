SUMMARY = "Python object model built on top of JSON schema"
DESCRIPTION = "Build self-validating python objects using JSON schemas."
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "python313-warlock-2.1.0-1.4.noarch.rpm"
RPM_HASH = "cb67d1ab3074507b545171171f3596e942642b74bce0dd7bcc1a21ce3aed7c05ce17932e24153c47a3e66341993fdc9ff9d1aecee2f180859ef7884df472df26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-warlock \
python3.13dist-warlock \
python313-warlock \
python3dist-warlock"

RDEPENDS:${PN} += "python-abi \
python313-jsonpatch \
python313-jsonschema"

inherit rpm
