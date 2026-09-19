SUMMARY = "Extensions and monkey-patching for django-stubs"
DESCRIPTION = "This package contains extensions and monkey-patching functions for the django-stubs package. Certain features of \
django-stubs (i.e. generic django classes that don't define the '__class_getitem__' method) require runtime \
monkey-patching, which can't be done with type stubs. These extensions were split into a separate package so library \
consumers don't need mypy as a runtime dependency (https://github.com/typeddjango/django-stubs/pull/526)."
LICENSE = "MIT"

PV = "6.1.0"

RPM_NAME = "python314-django-stubs-ext-6.1.0-1.1.noarch.rpm"
RPM_HASH = "8547a8f9916f459558351a4ec9f2a99095c52d20ec83d54b517de440bd34f47028e33a720677eee24dcadba4a9007f47f98e3d5415722bfa80326a1ffa911419"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-stubs-ext \
python314-django-stubs-ext \
python3dist-django-stubs-ext"

RDEPENDS:${PN} += "python-abi"

inherit rpm
