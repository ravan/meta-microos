SUMMARY = "Jinja2 templating language integrated in Django"
DESCRIPTION = "Simple and nonobstructive jinja2 integration with Django."
LICENSE = "BSD-3-Clause"

PV = "2.11.0"

RPM_NAME = "python314-django-jinja-2.11.0-2.5.noarch.rpm"
RPM_HASH = "dc103107f56acdce684dcd384a43cd5313e31c24b237805c5d7664d1178732a8d2ea1929697aadb768384265e7399dbf909f68676035676a59b2742d0f18e938"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-jinja \
python314-django-jinja \
python3dist-django-jinja"

RDEPENDS:${PN} += "python-abi \
python314-Django \
python314-Jinja2"

inherit rpm
