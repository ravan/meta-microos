SUMMARY = "Quickly add security features to your Flask application"
DESCRIPTION = "Quickly add security features to your Flask application."
LICENSE = "MIT"

PV = "5.8.1"

RPM_NAME = "python314-Flask-Security-5.8.1-1.2.noarch.rpm"
RPM_HASH = "029a0b192056382cb585149a1c9d1d7307491632d8515771f80871332386b933363b146c96ebd18d41a311e625a4f10041e6700b9236262e2808dccb9d9b77bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-flask-security \
python314-Flask-Security \
python314-Flask-Security-Too \
python3dist-flask-security"

RDEPENDS:${PN} += "python-abi \
python314-Flask \
python314-Flask-Login \
python314-Flask-Principal \
python314-Flask-WTF \
python314-MarkupSafe \
python314-WTForms \
python314-bcrypt \
python314-bleach \
python314-cryptography \
python314-email-validator \
python314-libpass"

inherit rpm
