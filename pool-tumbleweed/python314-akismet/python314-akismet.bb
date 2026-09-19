SUMMARY = "Interface to the Akismet Anti Comment-Spam API"
DESCRIPTION = "A Python interface to the Akismet anti comment-spam API."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "python314-akismet-1.2.1-2.5.noarch.rpm"
RPM_HASH = "4d7b38c847a5ac53eb77deb8b5899bddd21b98a98ce30365b7fd25749d69da3e08788a51edcccfdeb188e32398299ae7c066bacf419d6220ebafb2026af2427d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-akismet \
python314-akismet \
python3dist-akismet"

RDEPENDS:${PN} += "python-abi \
python314-requests"

inherit rpm
