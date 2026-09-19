SUMMARY = "Language Data for Weblate"
DESCRIPTION = "Contains several modules containing language definitions and Gettext \
translations for them (in a way that they would be discovered by Django \
when used as an Django application)."
LICENSE = "MIT"

PV = "2026.8"

RPM_NAME = "python314-weblate-language-data-2026.8-1.2.noarch.rpm"
RPM_HASH = "5fb98be8f938f5d5cfa8e98c83e8de2028c1efeceae59ef12706bdf7d5997560124301553306925b9cb9e0eaff4d19b124361661ed48489f8e117db0abcc7ba8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-weblate-language-data \
python314-weblate-language-data \
python3dist-weblate-language-data"

RDEPENDS:${PN} += "python-abi"

inherit rpm
