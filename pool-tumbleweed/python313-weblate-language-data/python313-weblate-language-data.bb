SUMMARY = "Language Data for Weblate"
DESCRIPTION = "Contains several modules containing language definitions and Gettext \
translations for them (in a way that they would be discovered by Django \
when used as an Django application)."
LICENSE = "MIT"

PV = "2026.8"

RPM_NAME = "python313-weblate-language-data-2026.8-1.2.noarch.rpm"
RPM_HASH = "d95f40c68fbee6325063ad95cd34429c220f0021d6f07d1a753a632017a1dc0646f93d56a2b085356006deabeb9a10654b56702fcb00b0164ffd6eae4708132b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-weblate-language-data \
python3.13dist-weblate-language-data \
python313-weblate-language-data \
python3dist-weblate-language-data"

RDEPENDS:${PN} += "python-abi"

inherit rpm
