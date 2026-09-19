SUMMARY = "Django model mixins and utilities"
DESCRIPTION = "Django model mixins and utilities."
LICENSE = "BSD-3-Clause"

PV = "5.0.0"

RPM_NAME = "python314-django-model-utils-5.0.0-2.1.noarch.rpm"
RPM_HASH = "8f0fe638cfb62e5a5ee6abe828eeeb6e06d829ae097053d979fdfbd94acd4003012b5530d4b0510ab4c3ecd6cd12145a62e7f478e9fadf6f6441e6b51f3a43a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-model-utils \
python314-django-model-utils \
python3dist-django-model-utils"

RDEPENDS:${PN} += "python-abi \
python314-Django"

inherit rpm
