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

RPM_NAME = "python314-django-picklefield-3.4.0-1.2.noarch.rpm"
RPM_HASH = "cce8436e4987c20c75247445997a7ee8e6540ed949abb6c4a3fc57c87034b8d96073bf743158479956cc5cec1c1bdeec9dc211e8c45ff189add05d61db5b5069"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-picklefield \
python314-django-picklefield \
python3dist-django-picklefield"

RDEPENDS:${PN} += "python-abi \
python314-Django"

inherit rpm
