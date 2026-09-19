SUMMARY = "Repackaging of Google's Diff Match and Patch libraries"
DESCRIPTION = "Offers algorithms to perform the operations required for synchronizing plain text"
LICENSE = "Apache-2.0"

PV = "20241021"

RPM_NAME = "python313-diff-match-patch-20241021-1.2.noarch.rpm"
RPM_HASH = "f1b91998c38b17c5a9bec0d35cc645cf3d4c0889413bf881b36ec6fa70de3861a517309d659f5829258aef650e4f46122f2f473fcd8171b69c275ed2167901dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-diff-match-patch \
python3.13dist-diff-match-patch \
python313-diff-match-patch \
python3dist-diff-match-patch"

RDEPENDS:${PN} += "python-abi"

inherit rpm
