SUMMARY = "Python library for manipulating datetimes"
DESCRIPTION = "Delorean is a library for clearing up the inconvenient truths that \
arise dealing with datetimes in Python."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python314-Delorean-1.0.0-5.5.noarch.rpm"
RPM_HASH = "ca6264ba6dec819df759a2356cc5f348c2503c21bad22139112fefd6c0347133ab30609431c39880057dfcfdea80006b7a1820a5b0c792b3ee3914a081c1167a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-delorean \
python314-Delorean \
python3dist-delorean"

RDEPENDS:${PN} += "python-abi \
python314-Babel \
python314-humanize \
python314-python-dateutil \
python314-pytz \
python314-tzlocal"

inherit rpm
