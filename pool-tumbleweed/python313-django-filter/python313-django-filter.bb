SUMMARY = "Reusable Django app to allow users to filter queryset dynamically"
DESCRIPTION = "Django-filter is a reusable Django application for allowing users to filter queryset dynamically. \
For usage and installation instructions, consult the docs directory."
LICENSE = "BSD-3-Clause"

PV = "26.1"

RPM_NAME = "python313-django-filter-26.1-1.1.noarch.rpm"
RPM_HASH = "b4d97967f8c6987485cc8385a0546627f35e44005e77151908d090366013256197fb71cd5c1733286820f3887c58fe899c1d4e51ac006bdf4ef18676b9b0c1dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-filter \
python3.13dist-django-filter \
python313-django-filter \
python3dist-django-filter"

RDEPENDS:${PN} += "python-abi \
python313-Django"

inherit rpm
