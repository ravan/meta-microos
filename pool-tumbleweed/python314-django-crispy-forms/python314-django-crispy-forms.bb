SUMMARY = "Django DRY Forms"
DESCRIPTION = "A module to build programmatic reusable layouts out of components \
with control over the rendered HTML without writing HTML in \
templates, and without breaking the standard way of doing things in \
Django."
LICENSE = "MIT"

PV = "2.7"

RPM_NAME = "python314-django-crispy-forms-2.7-1.1.noarch.rpm"
RPM_HASH = "f491e2a5eab502aa9b7abef92e67e4ec13f3abe71ba053e197261ee8eea9a83a9ab96b6e7a4c5e5df8e1402c5b9855f6bb6004a20eb33e9da26bdf6c49fa701a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-crispy-forms \
python314-django-crispy-forms \
python3dist-django-crispy-forms"

RDEPENDS:${PN} += "python-abi \
python314-Django"

inherit rpm
