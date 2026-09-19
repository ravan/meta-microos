SUMMARY = "Deep Difference and Search of any Python object/data"
DESCRIPTION = "A Python module to calculate Deep Difference of dictionaries, \
iterables, strings and other objects. It can search for objects \
within other objects, and hash any object based on their content."
LICENSE = "MIT"

PV = "9.0.0"

RPM_NAME = "python313-deepdiff-9.0.0-2.1.noarch.rpm"
RPM_HASH = "63f4fb1b849e550aff15c1642d795f610fa56c6b7d73d5b0daae0ad3a4ead8abe7ddd191cfa025d2535808f29edefd7e8e6084d1d2f99629b8752c6e2a245c1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-deepdiff \
python3.13dist-deepdiff \
python313-deepdiff \
python3dist-deepdiff"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-PyYAML \
python313-click \
python313-orderly-set"

inherit rpm
