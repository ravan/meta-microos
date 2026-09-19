SUMMARY = "Deep Difference and Search of any Python object/data"
DESCRIPTION = "A Python module to calculate Deep Difference of dictionaries, \
iterables, strings and other objects. It can search for objects \
within other objects, and hash any object based on their content."
LICENSE = "MIT"

PV = "9.0.0"

RPM_NAME = "python314-deepdiff-9.0.0-2.1.noarch.rpm"
RPM_HASH = "51200190e634632dd0572b2f3434f6437c594ec7db35d95454bb450b8561a0ce662f7471aab5a89fa9c3cf53ac4d810b975a039c1a4a71670f9084cd655aca56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-deepdiff \
python314-deepdiff \
python3dist-deepdiff"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-PyYAML \
python314-click \
python314-orderly-set"

inherit rpm
