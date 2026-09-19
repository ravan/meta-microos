SUMMARY = "Python Social Auth Core"
DESCRIPTION = "Python Social Auth is a social authentication/registration \
mechanism with support for several frameworks and auth providers. \
 \
This is the core component of the python-social-auth ecosystem. It \
implements the common interface to define new authentication backends to \
third party services, implement integrations with web frameworks and \
storage solutions."
LICENSE = "BSD-3-Clause"

PV = "5.0.2"

RPM_NAME = "python313-social-auth-core-5.0.2-2.1.noarch.rpm"
RPM_HASH = "85d12ee8e7cd395d960f3f53b2c2d643731a81febdd9d7543c25b7e856c79c6e89512d0f1e3f645156f003d939d2e8782d9ff999a81c45c7210d54f0a1681bb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-social-auth-core \
python3.13dist-social-auth-core \
python313-social-auth-core \
python3dist-social-auth-core"

RDEPENDS:${PN} += "python-abi \
python313-PyJWT \
python313-cryptography \
python313-defusedxml \
python313-oauthlib \
python313-python3-openid \
python313-python3-saml \
python313-requests \
python313-requests-oauthlib"

inherit rpm
