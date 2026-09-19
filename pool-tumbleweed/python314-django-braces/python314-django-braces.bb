SUMMARY = "Reusable, generic mixins for Django"
DESCRIPTION = "Reusable, generic mixins for Django."
LICENSE = "BSD-3-Clause"

PV = "1.17.0"

RPM_NAME = "python314-django-braces-1.17.0-2.5.noarch.rpm"
RPM_HASH = "c04fdb84926e610ee07b32fbd0440a0f63c6076d4a29d7c0e11048fa40f8121af5cb7e1c5abae7ee8aaf0d6ebf7b9b305f5f22dc21e2dd4ece482b1ce7abd2c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-braces \
python314-django-braces \
python3dist-django-braces"

RDEPENDS:${PN} += "python-abi \
python314-Django"

inherit rpm
