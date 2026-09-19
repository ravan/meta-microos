SUMMARY = "Parse and create Python distribution metadata"
DESCRIPTION = "Parse and create Python distribution metadata."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python314-dist-meta-0.9.0-1.3.noarch.rpm"
RPM_HASH = "46e456c1e4e958669e62bedb691873f3db15fa26e239e29e3e035b1e20bf3e3fe64cd12579d95b2a98e4aa06e24e4e2a070943b21cb0e20ae19e5780592cdef1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-dist-meta \
python314-dist-meta \
python3dist-dist-meta"

RDEPENDS:${PN} += "python-abi \
python314-domdf-python-tools \
python314-handy-archives \
python314-packaging"

inherit rpm
