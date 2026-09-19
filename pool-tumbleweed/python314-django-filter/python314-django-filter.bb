SUMMARY = "Reusable Django app to allow users to filter queryset dynamically"
DESCRIPTION = "Django-filter is a reusable Django application for allowing users to filter queryset dynamically. \
For usage and installation instructions, consult the docs directory."
LICENSE = "BSD-3-Clause"

PV = "26.1"

RPM_NAME = "python314-django-filter-26.1-1.1.noarch.rpm"
RPM_HASH = "cec4252ee963a5e041941f42ab99b2c8ec93010f55c7f1d9742d58685719bb9a4610930a11a23f4ca095d991ce13d43fc7ac6ab7b6f44a4f7b7f83de29e4561a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-filter \
python314-django-filter \
python3dist-django-filter"

RDEPENDS:${PN} += "python-abi \
python314-Django"

inherit rpm
