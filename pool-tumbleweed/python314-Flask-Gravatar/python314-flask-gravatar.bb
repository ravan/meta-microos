SUMMARY = "Small extension for Flask to make usage of Gravatar service"
DESCRIPTION = "Small extension for Flask to make usage of the Gravatar service."
LICENSE = "BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "python314-Flask-Gravatar-0.5.0-7.5.noarch.rpm"
RPM_HASH = "dcb59a9609e390d412fdacee69dad18544987113db1741719eb51e1ed59c1ef5adb1f7fd54012431cff4abb0fdc6f593f642eaac386c221138eea85a583d0408"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-flask-gravatar \
python314-Flask-Gravatar \
python3dist-flask-gravatar"

RDEPENDS:${PN} += "python-abi \
python314-Flask"

inherit rpm
