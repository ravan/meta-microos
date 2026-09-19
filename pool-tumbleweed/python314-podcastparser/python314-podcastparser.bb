SUMMARY = "A podcast parser"
DESCRIPTION = "The podcast parser project is a library from the gPodder project to provide a \
way of parsing RSS- and Atom-based podcast feeds in Python."
LICENSE = "ISC"

PV = "0.6.11"

RPM_NAME = "python314-podcastparser-0.6.11-1.4.noarch.rpm"
RPM_HASH = "ed4e5decc91e349d54cc70c5cb0c7300dea9120ad513da2b0b689a295544c99b76666ee0a0d5068309220b6599a5dfc4ebcf09c68edac9359d1b0cd436c8a9f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-podcastparser \
python314-podcastparser \
python3dist-podcastparser"

RDEPENDS:${PN} += "python-abi \
python314-xml"

inherit rpm
