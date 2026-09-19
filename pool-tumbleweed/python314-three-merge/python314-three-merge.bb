SUMMARY = "Simple library for merging two strings with respect to a base one"
DESCRIPTION = "Simple Python library to perform a 3-way merge between strings, based on \
diff-match-patch. This library performs merges at a character level, as \
opposed to most VCS systems, which opt for a line-based approach."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python314-three-merge-0.1.1-2.5.noarch.rpm"
RPM_HASH = "ae2674d394ee26391f3900c2f91de6170ed4e8a87314f204615ca689e4a9632401cc715c1271fa9e8e83283ae94fdba21e95236d800624d288af1b2e1727a43f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-three-merge \
python314-three-merge \
python3dist-three-merge"

RDEPENDS:${PN} += "python-abi \
python314-diff-match-patch"

inherit rpm
