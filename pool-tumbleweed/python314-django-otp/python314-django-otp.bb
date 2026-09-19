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

RPM_NAME = "python314-django-otp-1.7.0-2.2.noarch.rpm"
RPM_HASH = "608384a8fcf018fcea15f007d412cca2017a1c951eeaca61ddff9d27998e892e579562fdfce1c6b6edc7900a553d7fc671eb3fd36830114d4f51049098ae0a08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-otp \
python314-django-otp \
python3dist-django-otp"

RDEPENDS:${PN} += "python-abi \
python314-Django"

inherit rpm
