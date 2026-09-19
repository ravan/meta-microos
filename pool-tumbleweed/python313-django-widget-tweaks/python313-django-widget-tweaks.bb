SUMMARY = "Django form field rendering in templates"
DESCRIPTION = "Tweak the form field rendering in templates, not in python-level form definitions."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "python313-django-widget-tweaks-1.5.1-1.2.noarch.rpm"
RPM_HASH = "d72bbd2b1714bf9cffbb48bd843ed3e755a858ba154d718f8bf2829e0f215f1c1d803c21adc971b29134a47c9f75c21b5e91b7ba29dc8ff6ef246b724c447bcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-widget-tweaks \
python3.13dist-django-widget-tweaks \
python313-django-widget-tweaks \
python3dist-django-widget-tweaks"

RDEPENDS:${PN} += "python-abi \
python313-Django"

inherit rpm
