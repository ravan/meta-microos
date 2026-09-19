SUMMARY = "Quickly add security features to your Flask application"
DESCRIPTION = "Quickly add security features to your Flask application."
LICENSE = "MIT"

PV = "5.8.1"

RPM_NAME = "python313-Flask-Security-5.8.1-1.2.noarch.rpm"
RPM_HASH = "8c415f11c852afba18092b5cca4f48a024602ef37b1e1d510d789a7679e706213c307ed8c4521eeb72f8f7ab07279b31ab140f61f003f15a8266abdd5e95da73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-Security \
python3-Flask-Security-Too \
python3.13dist-flask-security \
python313-Flask-Security \
python313-Flask-Security-Too \
python3dist-flask-security"

RDEPENDS:${PN} += "python-abi \
python313-Flask \
python313-Flask-Login \
python313-Flask-Principal \
python313-Flask-WTF \
python313-MarkupSafe \
python313-WTForms \
python313-bcrypt \
python313-bleach \
python313-cryptography \
python313-email-validator \
python313-libpass"

inherit rpm
