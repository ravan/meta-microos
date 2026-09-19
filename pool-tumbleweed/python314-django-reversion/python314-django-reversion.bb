SUMMARY = "A Django extension that provides version control for model instances"
DESCRIPTION = "Django-reversion is an extension to the Django web framework that provides \
version control for model instances. \
 \
-  Roll back to any point in a model instance's history. \
-  Recover deleted model instances. \
-  Simple admin integration."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "python314-django-reversion-6.3.0-1.1.noarch.rpm"
RPM_HASH = "1d410a2e31b67513d48a6468e04aa51afcd27a5dc5217fa2c0234c51eb7fc57366dab6ffdbb4f9841977d4cfbcdff3d3b62d528fc5190f8cd1e9ea9f8607c907"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-reversion \
python314-django-reversion \
python3dist-django-reversion"

RDEPENDS:${PN} += "python-abi \
python314-Django"

inherit rpm
