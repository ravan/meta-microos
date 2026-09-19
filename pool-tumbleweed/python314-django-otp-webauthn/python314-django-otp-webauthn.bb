SUMMARY = "FIDO2 WebAuthn support for django-otp"
DESCRIPTION = "This package provides an implementation of [WebAuthn Passkeys](https://passkeys.dev/) for Django. \
It is written as a plugin for the [Django OTP framework](https://github.com/django-otp/django-otp) \
for multi-factor authentication. Under the hood, this package uses [py_webauth](https://github.com/duo-labs/py_webauthn/) \
to handle all cryptographic operations."
LICENSE = "BSD-3-Clause"

PV = "0.8.0"

RPM_NAME = "python314-django-otp-webauthn-0.8.0-2.2.noarch.rpm"
RPM_HASH = "1c198c1f0383736fb8cd405372d27b5dc3bc676e67083ffe45d8a7cc9b732628e3b3d47518f05e22890d1a505ab485a88b30b494e252e05c896b36f6f89b0b9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-otp-webauthn \
python314-django-otp-webauthn \
python3dist-django-otp-webauthn"

RDEPENDS:${PN} += "python-abi \
python314-Django \
python314-django-otp \
python314-djangorestframework \
python314-webauthn"

inherit rpm
