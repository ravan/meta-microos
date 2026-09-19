SUMMARY = "Python binding of Libdiscid"
DESCRIPTION = "Python-discid implements Python bindings for MusicBrainz Libdiscid. \
 \
Libdiscid's main purpose is the calculation of an identifier of audio \
discs (disc id) to use for the MusicBrainz database. \
 \
That identifier is calculated from the TOC of the disc, similar to the \
freeDB CDDB identifier. Libdiscid can calculate MusicBrainz Disc IDs and \
freeDB Disc IDs. \
Additionally the MCN of the disc and ISRCs from the tracks can be extracted. \
 \
This module is a close binding that offloads all relevant data \
storage and calculation to Libdiscid. On the other hand it gives a \
pythonic API and uses objects and exceptions."
LICENSE = "LGPL-3.0-or-later"

PV = "1.4.2"

RPM_NAME = "python313-discid-1.4.2-1.1.noarch.rpm"
RPM_HASH = "c1c84883b233fe5e5e9aa1d8675f100a2d5df5ee5ab4f46b845c6a1dc4b8d4258f7e5a93d4705a90928210413767a457b1bf8be2f901124fcc54866bc74bff81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-discid \
python3.13dist-discid \
python313-discid \
python3dist-discid"

RDEPENDS:${PN} += "libdiscid0 \
python-abi"

inherit rpm
