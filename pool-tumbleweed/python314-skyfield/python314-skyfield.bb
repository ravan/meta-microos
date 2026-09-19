SUMMARY = "Elegant astronomy for Python"
DESCRIPTION = "A Python astronomy package that makes it easy to generate high precision \
research-grade positions for planets and Earth satellites."
LICENSE = "MIT"

PV = "1.54"

RPM_NAME = "python314-skyfield-1.54-2.1.noarch.rpm"
RPM_HASH = "86b0834db4d468030f4dea094636abed56e9148a9b3b87f9c1c48bbdde9e211a9d7189b6d42abba1f0f5b5075f351ab13ec07b7bf001bfe3e0a785123f1390d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-skyfield \
python314-skyfield \
python3dist-skyfield"

RDEPENDS:${PN} += "python-abi \
python314-certifi \
python314-jplephem \
python314-numpy \
python314-sgp4"

inherit rpm
