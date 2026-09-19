SUMMARY = "Gravatar Support for Django"
DESCRIPTION = "Essential Gravatar support for Django. Features helper methods, templatetags and a full test suite!"
LICENSE = "MIT"

PV = "1.4.5"

RPM_NAME = "python314-django-gravatar2-1.4.5-1.2.noarch.rpm"
RPM_HASH = "cef8af40d85eb446830974f5acdce5952fdedfaf7b15afc37b4a4058b82b6899d718d68f3a46d657ec806ca5dcf2589a63efb121a00472695b6ac68a61304fd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-gravatar2 \
python314-django-gravatar2 \
python3dist-django-gravatar2"

RDEPENDS:${PN} += "python-abi"

inherit rpm
