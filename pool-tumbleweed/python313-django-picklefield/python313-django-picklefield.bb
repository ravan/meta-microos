SUMMARY = "Pickled object field for Django"
DESCRIPTION = "django-picklefield provides an implementation of a pickled object field. \
Such fields can contain any picklable objects. \
 \
The implementation is taken and adopted from Django snippet #1694 \
<http://www.djangosnippets.org/snippets/1694/> by Taavi Taijala, which is in \
turn based on Django snippet #513 <http://www.djangosnippets.org/snippets/513/> \
by Oliver Beattie."
LICENSE = "MIT"

PV = "3.4.0"

RPM_NAME = "python313-django-picklefield-3.4.0-1.2.noarch.rpm"
RPM_HASH = "cf7c6b8a83cfc8ca8c68b88eb4cc9e5e37c8d2a42d7cc211ea41a31204ee40a1ddbd54946065e399fc35d8a6f8a5653e718bf79b4e21a8ee46820f73a48d7cc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-picklefield \
python3.13dist-django-picklefield \
python313-django-picklefield \
python3dist-django-picklefield"

RDEPENDS:${PN} += "python-abi \
python313-Django"

inherit rpm
