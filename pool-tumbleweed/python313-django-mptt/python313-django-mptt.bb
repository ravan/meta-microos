SUMMARY = "Modified Preorder Tree Traversal for Django Models"
DESCRIPTION = "Utilities for implementing Modified Preorder Tree Traversal with your Django Models and working with trees of Model instances."
LICENSE = "MIT"

PV = "0.18"

RPM_NAME = "python313-django-mptt-0.18-1.2.noarch.rpm"
RPM_HASH = "35d4c2f652cbb54bb7dd8c3d1cfbaa2a68be930a08d00e0ff97aa80523d0510c1127bb22d2c7140be9ac4f024c0260797ce39d427f0bda1bc6b925d445d3fbd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-mptt \
python3.13dist-django-mptt \
python313-django-mptt \
python3dist-django-mptt"

RDEPENDS:${PN} += "python-abi \
python313-Django \
python313-django-js-asset"

inherit rpm
