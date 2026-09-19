SUMMARY = "GEDCOM tools for Python"
DESCRIPTION = "GEDCOM tools for Python."
LICENSE = "MIT"

PV = "0.5.2"

RPM_NAME = "python314-ged4py-0.5.2-1.2.noarch.rpm"
RPM_HASH = "d06c7da1739287659ca90d61fdea2f577c1449119b48b64ee7cb34fbba78fae69d82306d6313c9346be2f9485d9000831837f12ab365135377ba7f7388cc3617"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ged4py \
python314-ged4py \
python3dist-ged4py"

RDEPENDS:${PN} += "python-abi \
python314-ansel \
python314-convertdate"

inherit rpm
