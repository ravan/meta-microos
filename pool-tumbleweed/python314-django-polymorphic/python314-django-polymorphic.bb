SUMMARY = "Polymorphic inheritance for Django models"
DESCRIPTION = "Seamless polymorphic inheritance for Django models."
LICENSE = "BSD-3-Clause"

PV = "4.11.7"

RPM_NAME = "python314-django-polymorphic-4.11.7-1.1.noarch.rpm"
RPM_HASH = "246fd39d3a83c4b29d8a4be2b436aace08383f3a4ccba4f6e5e935951bfbb78004e9ce51520d20df4e04dee318b18c5a3e06c66bb9d289defe1c0337e75b3587"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-polymorphic \
python314-django-polymorphic \
python3dist-django-polymorphic"

RDEPENDS:${PN} += "python-abi \
python314-Django \
python314-typing-extensions"

inherit rpm
