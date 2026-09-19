SUMMARY = "Repackaging of Google's Diff Match and Patch libraries"
DESCRIPTION = "Offers algorithms to perform the operations required for synchronizing plain text"
LICENSE = "Apache-2.0"

PV = "20241021"

RPM_NAME = "python314-diff-match-patch-20241021-1.2.noarch.rpm"
RPM_HASH = "abf72016ba5e4c8a83e0684e80a576b524005140d52e10d7c907b77aed8ba7b3d46ae90d759964ead4a68cae5e229d2f5d7777790200e8441b03dd6674fd7074"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-diff-match-patch \
python314-diff-match-patch \
python3dist-diff-match-patch"

RDEPENDS:${PN} += "python-abi"

inherit rpm
