SUMMARY = "PEP-484 stubs for Django"
DESCRIPTION = "This package contains type stubs and a custom mypy plugin to provide more precise static types and type inference for \
Django framework. Django uses some Python 'magic' that makes having precise types for some code patterns problematic. \
This is why we need this project. The final goal is to be able to get precise types for most common patterns."
LICENSE = "MIT"

PV = "6.1.0"

RPM_NAME = "python314-django-stubs-6.1.0-1.1.noarch.rpm"
RPM_HASH = "c9c1e1ff8ecf094972d5d5f663b34b373e1d7ac15f918eb0746852dbea0422aff43b7a22605ccfb1c32e2c934a4ac40ca4b5f0417c73fe12a61a22c054ad3b03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-stubs \
python314-django-stubs \
python3dist-django-stubs"

RDEPENDS:${PN} += "python-abi \
python314-Django \
python314-django-stubs-ext \
python314-types-PyYAML \
python314-typing-extensions"

inherit rpm
