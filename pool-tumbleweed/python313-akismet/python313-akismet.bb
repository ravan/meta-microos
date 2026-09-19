SUMMARY = "Interface to the Akismet Anti Comment-Spam API"
DESCRIPTION = "A Python interface to the Akismet anti comment-spam API."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "python313-akismet-1.2.1-2.5.noarch.rpm"
RPM_HASH = "96f2c633186c7e141e65477f1db0bd0eff736c1ca017e1782ff84f2b9e5a4325f9dd18128af782058ed6a6afefcac58ebdca009135dc97bbe5e7029313d7b42d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-akismet \
python3.13dist-akismet \
python313-akismet \
python3dist-akismet"

RDEPENDS:${PN} += "python-abi \
python313-requests"

inherit rpm
