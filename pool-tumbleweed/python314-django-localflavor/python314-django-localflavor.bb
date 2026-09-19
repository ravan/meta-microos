SUMMARY = "Country-specific Django helpers"
DESCRIPTION = "Country-specific Django helpers."
LICENSE = "BSD-3-Clause"

PV = "5.1"

RPM_NAME = "python314-django-localflavor-5.1-1.1.noarch.rpm"
RPM_HASH = "f249b51046edcb790005105a611819eb17e143984e46e644e36a174f95a2821e4757ce6b1ce138ab29f9c8e5624b5a970e9f046f5193bb4258c952d439091633"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-localflavor \
python314-django-localflavor \
python3dist-django-localflavor"

RDEPENDS:${PN} += "python-abi \
python314-Django \
python314-python-stdnum"

inherit rpm
