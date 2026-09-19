SUMMARY = "A Helper Class for Handling Configuration Defaults of Packaged Apps"
DESCRIPTION = "A helper class for handling configuration defaults of packaged Django apps \
gracefully."
LICENSE = "BSD-3-Clause"

PV = "1.2.0"

RPM_NAME = "python314-django-appconf-1.2.0-1.4.noarch.rpm"
RPM_HASH = "3921d08cc06787547b95eb296f04f02dc6b4815a23528455a1f7b5e26441d0d05f4c71841d0a1e4766c637a010acf1bae41c343a68990c12baae25b13fb23c43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-appconf \
python314-django-appconf \
python3dist-django-appconf"

RDEPENDS:${PN} += "python-abi \
python314-Django"

inherit rpm
