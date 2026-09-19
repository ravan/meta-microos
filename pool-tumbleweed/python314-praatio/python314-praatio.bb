SUMMARY = "A library for working with praat"
DESCRIPTION = "A library for working with praat, time aligned audio transcripts, and \
audio files. \
 \
Praat uses a file format called textgrids, which are time aligned \
speech transcripts. This library also provides utilities are to work \
with  transcripts and associated audio file and some other tools for \
use with praat."
LICENSE = "MIT"

PV = "4.1.0"

RPM_NAME = "python314-praatio-4.1.0-3.5.noarch.rpm"
RPM_HASH = "169bc4e0efc88b2320684c2ba2665d4b72f707885965ea20889f823aecbe55a268cc64c1608c956787124457767c7bfbab245ddf1f203715542d214d5cc02048"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-praatio \
python314-praatio \
python3dist-praatio"

RDEPENDS:${PN} += "python-abi"

inherit rpm
