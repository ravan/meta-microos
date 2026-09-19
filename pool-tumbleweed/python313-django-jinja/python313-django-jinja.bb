SUMMARY = "Jinja2 templating language integrated in Django"
DESCRIPTION = "Simple and nonobstructive jinja2 integration with Django."
LICENSE = "BSD-3-Clause"

PV = "2.11.0"

RPM_NAME = "python313-django-jinja-2.11.0-2.5.noarch.rpm"
RPM_HASH = "152df3f6df89932c03f323901690b0eadf97a376530e4aff778808c2ef2f700feed633a67286086ee3077e11c15659dcfb1cfef33ebdecef47a0660aa3f0e93e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-jinja \
python3.13dist-django-jinja \
python313-django-jinja \
python3dist-django-jinja"

RDEPENDS:${PN} += "python-abi \
python313-Django \
python313-Jinja2"

inherit rpm
