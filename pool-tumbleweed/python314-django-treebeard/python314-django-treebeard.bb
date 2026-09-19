SUMMARY = "Efficient tree implementations for Django"
DESCRIPTION = "django-treebeard is a library that implements three efficient tree implementations \
for the Django Web Framework: \
 \
- Adjacency List \
- Materialized Path \
- Nested Sets"
LICENSE = "Apache-2.0"

PV = "5.0.5"

RPM_NAME = "python314-django-treebeard-5.0.5-1.3.noarch.rpm"
RPM_HASH = "4ea7bef67a02f57f30df8aa4316ac07dcaab02d8e0a079483b58fc7a09e564e187e2c5518d9715fc46ca00b61d1f1583ec391e24f939ce3620920bc942b967e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-treebeard \
python314-django-treebeard \
python3dist-django-treebeard"

RDEPENDS:${PN} += "python-abi \
python314-Django"

inherit rpm
