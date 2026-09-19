SUMMARY = "Packrat parser interpreter"
DESCRIPTION = "Arpeggio is a recursive descent parser with memoization based on PEG grammars \
(aka Packrat parser). \
 \
For a higher level parsing/language tool (i.e., a nicer interface to \
Arpeggio) see textX"
LICENSE = "MIT"

PV = "2.0.3"

RPM_NAME = "python314-Arpeggio-2.0.3-1.4.noarch.rpm"
RPM_HASH = "6fc8d86029f633c1080fc1ba2a464192d96cd7b0d6fcee826789c093c6f95f960e223f9bf08f461e84caaf60a37354632f3d0ca8b0554a641acda5ea1904e2bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-arpeggio \
python314-Arpeggio \
python3dist-arpeggio"

RDEPENDS:${PN} += "python-abi"

inherit rpm
