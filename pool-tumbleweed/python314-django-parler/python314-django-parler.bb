SUMMARY = "Simple Django model translations"
DESCRIPTION = "Simple Django model translations without nasty hacks, including admin integration."
LICENSE = "Apache-2.0"

PV = "2.4"

RPM_NAME = "python314-django-parler-2.4-1.2.noarch.rpm"
RPM_HASH = "36a055c9b55eef1b9203338c604423da38b095f8e7332fdc714347bbb90cbfc2513227f8e2c816a518f568e801755ffe6a96a2c700300dc840201fc08b677763"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-parler \
python314-django-parler \
python3dist-django-parler"

RDEPENDS:${PN} += "python-abi \
python314-Django"

inherit rpm
