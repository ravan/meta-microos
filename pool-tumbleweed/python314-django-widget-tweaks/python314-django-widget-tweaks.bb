SUMMARY = "Django form field rendering in templates"
DESCRIPTION = "Tweak the form field rendering in templates, not in python-level form definitions."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "python314-django-widget-tweaks-1.5.1-1.2.noarch.rpm"
RPM_HASH = "22a39ce810815c0e67d8fccbe61c02c4d33f07aa36b29d13d62bdddcdc621ffe890706703bb802cf79e36d714c8b5b39d03009747e6fbefaeb16d12e05ca1384"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-widget-tweaks \
python314-django-widget-tweaks \
python3dist-django-widget-tweaks"

RDEPENDS:${PN} += "python-abi \
python314-Django"

inherit rpm
