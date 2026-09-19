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

RPM_NAME = "python313-praatio-4.1.0-3.5.noarch.rpm"
RPM_HASH = "7df06b086ce3870f110832eef4b05e83c93940c9777f7d2394f15d29f65b7a4b298894a18b239861205089478e46d8d266ea4d0d68130df385b27da5c2d682e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-praatio \
python3.13dist-praatio \
python313-praatio \
python3dist-praatio"

RDEPENDS:${PN} += "python-abi"

inherit rpm
