SUMMARY = "Extensions and monkey-patching for django-stubs"
DESCRIPTION = "This package contains extensions and monkey-patching functions for the django-stubs package. Certain features of \
django-stubs (i.e. generic django classes that don't define the '__class_getitem__' method) require runtime \
monkey-patching, which can't be done with type stubs. These extensions were split into a separate package so library \
consumers don't need mypy as a runtime dependency (https://github.com/typeddjango/django-stubs/pull/526)."
LICENSE = "MIT"

PV = "6.1.0"

RPM_NAME = "python313-django-stubs-ext-6.1.0-1.1.noarch.rpm"
RPM_HASH = "fc0b44163ec348459a2317c7647203e8cd33cc8f44cfc69e5a03b62f2e72cbff8d30194ff901f84847d3f365133add4a44bc5dd22c4bfed35d8a4209c0890257"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-stubs-ext \
python3.13dist-django-stubs-ext \
python313-django-stubs-ext \
python3dist-django-stubs-ext"

RDEPENDS:${PN} += "python-abi"

inherit rpm
