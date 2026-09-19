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

RPM_NAME = "python314-flask-jwt-extended-4.7.4-1.1.noarch.rpm"
RPM_HASH = "f51d65499364d51525873f20e432555f4c5d97182ba6cba03d491cd8b252b1323b0fb497ac575be267f9fdb2e5a71eeba2a34eed7823eaf322f33486bd58d943"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-flask-jwt-extended \
python314-flask-jwt-extended \
python3dist-flask-jwt-extended"

RDEPENDS:${PN} += "python-abi \
python314-Flask \
python314-PyJWT \
python314-Werkzeug"

inherit rpm
