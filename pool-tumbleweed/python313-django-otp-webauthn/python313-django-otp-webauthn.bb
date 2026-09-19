SUMMARY = "FIDO2 WebAuthn support for django-otp"
DESCRIPTION = "This package provides an implementation of [WebAuthn Passkeys](https://passkeys.dev/) for Django. \
It is written as a plugin for the [Django OTP framework](https://github.com/django-otp/django-otp) \
for multi-factor authentication. Under the hood, this package uses [py_webauth](https://github.com/duo-labs/py_webauthn/) \
to handle all cryptographic operations."
LICENSE = "BSD-3-Clause"

PV = "0.8.0"

RPM_NAME = "python313-django-otp-webauthn-0.8.0-2.2.noarch.rpm"
RPM_HASH = "af048971d346f01c4a459e83d6feeb1bb6262ab89ed7340e4268dcf067781ea67d804bf1b2b5f5541618e5c20f7a4039c289113d231300678a7757dd73c2e128"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-otp-webauthn \
python3.13dist-django-otp-webauthn \
python313-django-otp-webauthn \
python3dist-django-otp-webauthn"

RDEPENDS:${PN} += "python-abi \
python313-Django \
python313-django-otp \
python313-djangorestframework \
python313-webauthn"

inherit rpm
