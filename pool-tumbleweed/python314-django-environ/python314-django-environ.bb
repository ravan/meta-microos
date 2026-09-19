SUMMARY = "Django application configuration via environment variables"
DESCRIPTION = "Django-environ allows utilizing 12factor inspired environment \
variables to configure Django applications."
LICENSE = "MIT"

PV = "0.14.0"

RPM_NAME = "python314-django-environ-0.14.0-1.2.noarch.rpm"
RPM_HASH = "e5b42648394471584b83b846d3838725b6c293472fb9e7d3f17cfbae36ee720600512f8349b7aa67d1c0644acf4b8fcd9e759d77abd29711e429824e3e676f37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-environ \
python314-django-environ \
python3dist-django-environ"

RDEPENDS:${PN} += "python-abi \
python314-Django"

inherit rpm
