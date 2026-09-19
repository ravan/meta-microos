SUMMARY = "A Flask extension that provides JWT support"
DESCRIPTION = "Flask-JWT-Extended not only adds support for using JSON Web Tokens \
(JWT) to Flask for protecting views, but also many \
(optional) features built in to make working with JSON \
Web Tokens easier. These include: \
 \
- Support for adding custom claims to JSON Web Tokens \
- Custom claims validation on received tokens \
- Creating tokens from complex objects or complex object from received tokens \
- Refresh tokens \
- Token freshness and separate view decorators to only allow fresh tokens \
- Token revoking/blacklisting \
- Storing tokens in cookies and CSRF protection"
LICENSE = "MIT"

PV = "4.7.4"

RPM_NAME = "python313-flask-jwt-extended-4.7.4-1.1.noarch.rpm"
RPM_HASH = "d84eab5fabe55eef92387224e712290df76dbd080206afeb7c2f04ebe9506d608cbe4ddd7a975710ae0b3dca0547c362ce6b5b14a4af0b2cb2ded21e4deca75d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flask-jwt-extended \
python3.13dist-flask-jwt-extended \
python313-flask-jwt-extended \
python3dist-flask-jwt-extended"

RDEPENDS:${PN} += "python-abi \
python313-Flask \
python313-PyJWT \
python313-Werkzeug"

inherit rpm
