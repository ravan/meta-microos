SUMMARY = "Evaluate your speech-to-text system with similarity measures"
DESCRIPTION = "JiWER is a simple and fast python package to evaluate an automatic speech recognition system. \
It supports the following measures: \
 \
1. word error rate (WER) \
2. match error rate (MER) \
3. word information lost (WIL) \
4. word information preserved (WIP) \
5. character error rate (CER)"
LICENSE = "Apache-2.0"

PV = "4.0.0"

RPM_NAME = "python314-jiwer-4.0.0-1.5.noarch.rpm"
RPM_HASH = "65bf3d787011d4861f7049aea5bbd201a97cbb177a1a8d3730ea7565f3dd1a2f149a33ae9cfad9000ea8840cba271082a751de22c960293d2e5d7de9c0143812"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jiwer \
python314-jiwer \
python3dist-jiwer"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-click \
python314-rapidfuzz \
update-alternatives"

inherit rpm
