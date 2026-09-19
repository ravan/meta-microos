SUMMARY = "Polymorphic inheritance for Django models"
DESCRIPTION = "Seamless polymorphic inheritance for Django models."
LICENSE = "BSD-3-Clause"

PV = "4.11.7"

RPM_NAME = "python313-django-polymorphic-4.11.7-1.1.noarch.rpm"
RPM_HASH = "0b039351fb49b2a510c2108e5868b678ad3c091cf501be32e51d284e7b18ac4e655544ae392b70c312af39ff1d4de00d15a468340b8ef5eb136bc026a7720918"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-polymorphic \
python3.13dist-django-polymorphic \
python313-django-polymorphic \
python3dist-django-polymorphic"

RDEPENDS:${PN} += "python-abi \
python313-Django \
python313-typing-extensions"

inherit rpm
