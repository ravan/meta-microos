SUMMARY = "Django math filters"
DESCRIPTION = "A set of math filters for Django."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python313-django-mathfilters-1.0.0-3.5.noarch.rpm"
RPM_HASH = "ac10939a07f714a794889b665d41d0e5f1ba6463cd2253b24045850869239d3b1794a5544b3e07ab1da58b048ec1371e838d16219f891fd18acffd88fbaab4c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-mathfilters \
python3.13dist-django-mathfilters \
python313-django-mathfilters \
python3dist-django-mathfilters"

RDEPENDS:${PN} += "python-abi \
python313-Django"

inherit rpm
