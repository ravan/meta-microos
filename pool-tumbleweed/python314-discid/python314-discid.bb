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

RPM_NAME = "python314-discid-1.4.2-1.1.noarch.rpm"
RPM_HASH = "de301ca5ea1066d4b47a0c3d764b9b9798c99696c935ddbefba769f86c9bf0918cc1c97a7838d6c85017e328fb2b75c9eba7d7f6cee0cf6e53d8f957a41214bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-discid \
python314-discid \
python3dist-discid"

RDEPENDS:${PN} += "libdiscid0 \
python-abi"

inherit rpm
