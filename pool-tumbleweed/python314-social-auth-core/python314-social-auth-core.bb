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

RPM_NAME = "python314-social-auth-core-5.0.2-2.1.noarch.rpm"
RPM_HASH = "3fd75d915553de4f3675c792eea9cbfe1c94658ead83171292a92f2c48a00cdd1c4e807dde0b0a76298a4884d2cb51668ad1d49a1716748fc53953c39fde00a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-social-auth-core \
python314-social-auth-core \
python3dist-social-auth-core"

RDEPENDS:${PN} += "python-abi \
python314-PyJWT \
python314-cryptography \
python314-defusedxml \
python314-oauthlib \
python314-python3-openid \
python314-python3-saml \
python314-requests \
python314-requests-oauthlib"

inherit rpm
