SUMMARY = "JSON Web Token authentication for Django REST Framework"
DESCRIPTION = "A minimal JSON Web Token authentication plugin for the Django REST Framework."
LICENSE = "MIT"

PV = "5.5.1"

RPM_NAME = "python313-djangorestframework-simplejwt-5.5.1-3.1.noarch.rpm"
RPM_HASH = "e4fa0b239545790e62ab85fdf7b6767920655cf717fecbc64a76dc9960afca5c38784e6639d801ffc0ae08e9c77c22d9e25b665858d11ed0bb53eca94f4ca5ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-djangorestframework-simplejwt \
python3.13dist-djangorestframework-simplejwt \
python313-djangorestframework-simplejwt \
python3dist-djangorestframework-simplejwt"

RDEPENDS:${PN} += "python-abi \
python313-Django \
python313-PyJWT \
python313-djangorestframework"

inherit rpm
