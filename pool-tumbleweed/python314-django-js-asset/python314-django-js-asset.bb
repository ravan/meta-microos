SUMMARY = "Script tag with additional attributes for django.formsMedia"
DESCRIPTION = "Insert a script tag via forms.Media containing additional \
attributes (such as id and data-* for CSP-compatible data \
injection.)"
LICENSE = "BSD-3-Clause"

PV = "4.0.2"

RPM_NAME = "python314-django-js-asset-4.0.2-1.1.noarch.rpm"
RPM_HASH = "e3897e8203d0feec94531b2bcc36aa1d7a1bbc209b38d2c3e4eecf2346b8a45721538d0722d8eef7a8b8219fb2c6ab8cdb8da6ab16976646f4e6225fb90bc8fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-js-asset \
python314-django-js-asset \
python3dist-django-js-asset"

RDEPENDS:${PN} += "python-abi \
python314-Django"

inherit rpm
