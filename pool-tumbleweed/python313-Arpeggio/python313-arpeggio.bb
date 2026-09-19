SUMMARY = "Packrat parser interpreter"
DESCRIPTION = "Arpeggio is a recursive descent parser with memoization based on PEG grammars \
(aka Packrat parser). \
 \
For a higher level parsing/language tool (i.e., a nicer interface to \
Arpeggio) see textX"
LICENSE = "MIT"

PV = "2.0.3"

RPM_NAME = "python313-Arpeggio-2.0.3-1.4.noarch.rpm"
RPM_HASH = "4b7555782c43d59f444d95c15aec7abf2d15adb9e1efad230e72b497704d07475c0db4693d2833dfe8e24108a2d0565d2511817b6121acd0f02ed13999cb59b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Arpeggio \
python3.13dist-arpeggio \
python313-Arpeggio \
python3dist-arpeggio"

RDEPENDS:${PN} += "python-abi"

inherit rpm
