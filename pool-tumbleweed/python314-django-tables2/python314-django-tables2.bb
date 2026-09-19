SUMMARY = "Table/data-grid framework for Django"
DESCRIPTION = "Simplifies the task of turning sets of data into HTML tables. It has native \
support for pagination and sorting. It does for HTML tables what django.forms \
does for HTML forms."
LICENSE = "BSD-2-Clause"

PV = "3.0.0"

RPM_NAME = "python314-django-tables2-3.0.0-1.2.noarch.rpm"
RPM_HASH = "a8c103c4d1bc23395cb3a86e41760b8cd9e87d59a8d87cace2feb317f54f45dafe0c5d1b1eb3ad2673eb8f7f9867ebc55c2dbba25adee1fd892c50d889c4f658"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-tables2 \
python314-django-tables2 \
python3dist-django-tables2"

RDEPENDS:${PN} += "python-abi \
python314-Django"

inherit rpm
