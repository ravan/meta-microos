SUMMARY = "Efficient tree implementations for Django"
DESCRIPTION = "django-treebeard is a library that implements three efficient tree implementations \
for the Django Web Framework: \
 \
- Adjacency List \
- Materialized Path \
- Nested Sets"
LICENSE = "Apache-2.0"

PV = "5.0.5"

RPM_NAME = "python313-django-treebeard-5.0.5-1.3.noarch.rpm"
RPM_HASH = "e4558fe112442e011a4252b6985ec5b6ffbc2ad13b42e097604ec4ef52e157434b907f9a8db4f86610cf8c39e1608a483f7112dcf6ad038a1893132bda8d8450"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-treebeard \
python3.13dist-django-treebeard \
python313-django-treebeard \
python3dist-django-treebeard"

RDEPENDS:${PN} += "python-abi \
python313-Django"

inherit rpm
