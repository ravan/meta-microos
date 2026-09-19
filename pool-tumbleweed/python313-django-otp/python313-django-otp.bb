SUMMARY = "Add two-factor authentication to Django using one-time passwords"
DESCRIPTION = "This project makes it easy to add support for `one-time passwords \
<http://en.wikipedia.org/wiki/One-time_password>`_ (OTPs) to Django. It can be \
integrated at various levels, depending on how much customization is required. \
It integrates with ``django.contrib.auth``, although it is not a Django \
authentication backend. The primary target is developers wishing to incorporate \
OTPs into their Django projects as a form of `two-factor authentication \
<http://en.wikipedia.org/wiki/Two-factor_authentication>`_. \
 \
Several simple OTP plugins are included and more are available separately. This \
package also includes an implementation of OATH `HOTP \
<http://tools.ietf.org/html/rfc4226>`_ and `TOTP \
<http://tools.ietf.org/html/rfc6238>`_ for convenience, as these are standard \
OTP algorithms used by multiple plugins. \
 \
If you're looking for a higher-level or more opinionated solution, you might be \
interested in `django-two-factor-auth \
<https://github.com/Bouke/django-two-factor-auth>`_."
LICENSE = "Unlicense"

PV = "1.7.0"

RPM_NAME = "python313-django-otp-1.7.0-2.2.noarch.rpm"
RPM_HASH = "50cac532702c8525c4e9fddf2ce9322f247e68812b397015da981ee3868e151d80192c7cce102f0cae8aecb19ac1fefe4b0e99597122e3ca6b8477e53d4ae721"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-otp \
python3.13dist-django-otp \
python313-django-otp \
python3dist-django-otp"

RDEPENDS:${PN} += "python-abi \
python313-Django"

inherit rpm
