SUMMARY = "Modified Preorder Tree Traversal for Django Models"
DESCRIPTION = "Utilities for implementing Modified Preorder Tree Traversal with your Django Models and working with trees of Model instances."
LICENSE = "MIT"

PV = "0.18"

RPM_NAME = "python314-django-mptt-0.18-1.2.noarch.rpm"
RPM_HASH = "5d612e1ab5b7cd5bbb4fe247c7dfe81e0422b51290906c5d90030df2da85e9ed529950b559a675a1a2d4783bb508659cafe2a6dcdb6b5a5155085e3b3ce62450"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-mptt \
python314-django-mptt \
python3dist-django-mptt"

RDEPENDS:${PN} += "python-abi \
python314-Django \
python314-django-js-asset"

inherit rpm
