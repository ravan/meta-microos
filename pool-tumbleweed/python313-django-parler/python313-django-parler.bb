SUMMARY = "Simple Django model translations"
DESCRIPTION = "Simple Django model translations without nasty hacks, including admin integration."
LICENSE = "Apache-2.0"

PV = "2.4"

RPM_NAME = "python313-django-parler-2.4-1.2.noarch.rpm"
RPM_HASH = "c9ff728830ee0b3c96fbf99d1945fa3c9853cdbea5aedb5363ae20e720261ff87c72b2432cef7ffb3f7b843058e3dbf91f3775bcb9c1a6efb84c2a5cde56df6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-parler \
python3.13dist-django-parler \
python313-django-parler \
python3dist-django-parler"

RDEPENDS:${PN} += "python-abi \
python313-Django"

inherit rpm
