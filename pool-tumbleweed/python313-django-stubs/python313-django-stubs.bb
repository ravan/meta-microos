SUMMARY = "PEP-484 stubs for Django"
DESCRIPTION = "This package contains type stubs and a custom mypy plugin to provide more precise static types and type inference for \
Django framework. Django uses some Python 'magic' that makes having precise types for some code patterns problematic. \
This is why we need this project. The final goal is to be able to get precise types for most common patterns."
LICENSE = "MIT"

PV = "6.1.0"

RPM_NAME = "python313-django-stubs-6.1.0-1.1.noarch.rpm"
RPM_HASH = "6528556cb39747b4cad2e9551afd5a530615c8ab043fe595907ef1b27e61ec0fb68d83d63e3d455e11a4a2f9dfe857122621863706d019454e23bdd0671ce83c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-stubs \
python3.13dist-django-stubs \
python313-django-stubs \
python3dist-django-stubs"

RDEPENDS:${PN} += "python-abi \
python313-Django \
python313-django-stubs-ext \
python313-types-PyYAML \
python313-typing-extensions"

inherit rpm
