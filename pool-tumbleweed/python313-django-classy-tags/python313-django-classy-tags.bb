SUMMARY = "Class based template tags for Django"
DESCRIPTION = "This project creates an altnerate way of writing Django template tags \
which is fully compatible with the current Django templating infrastructure."
LICENSE = "MIT"

PV = "4.1.0"

RPM_NAME = "python313-django-classy-tags-4.1.0-2.5.noarch.rpm"
RPM_HASH = "0b3faba74ebec26b328123516c12028c1fad6610cbf20a7aac988272b6f14deb3f91ce028267f75a90996d3f0b4fe6430eec53d9c5bf46ef44a540424454f020"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-classy-tags \
python3.13dist-django-classy-tags \
python313-django-classy-tags \
python3dist-django-classy-tags"

RDEPENDS:${PN} += "python-abi \
python313-Django"

inherit rpm
