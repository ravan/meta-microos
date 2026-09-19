SUMMARY = "Country-specific Django helpers"
DESCRIPTION = "Country-specific Django helpers."
LICENSE = "BSD-3-Clause"

PV = "5.1"

RPM_NAME = "python313-django-localflavor-5.1-1.1.noarch.rpm"
RPM_HASH = "07e39fba71f4f588f008c5216e20c27207b99cfac40d7806901c64a115fd1d9554a71b6668520299ad94c4c6232dc6a6548ca2e7706a79cc7dfbd05cc3084fdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-localflavor \
python3.13dist-django-localflavor \
python313-django-localflavor \
python3dist-django-localflavor"

RDEPENDS:${PN} += "python-abi \
python313-Django \
python313-python-stdnum"

inherit rpm
