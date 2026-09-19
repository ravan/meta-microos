SUMMARY = "JSON Web Token authentication for Django REST Framework"
DESCRIPTION = "A minimal JSON Web Token authentication plugin for the Django REST Framework."
LICENSE = "MIT"

PV = "5.5.1"

RPM_NAME = "python314-djangorestframework-simplejwt-5.5.1-3.1.noarch.rpm"
RPM_HASH = "14814cee280a36548446f26411fccc9f284edb1941d715f91a4c225620261ab1b7bd75a8a659e6461d90b8c9383020718afd88be29a39b07cac0f8f039bc10a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-djangorestframework-simplejwt \
python314-djangorestframework-simplejwt \
python3dist-djangorestframework-simplejwt"

RDEPENDS:${PN} += "python-abi \
python314-Django \
python314-PyJWT \
python314-djangorestframework"

inherit rpm
