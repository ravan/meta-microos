SUMMARY = "Simple app that provides django integration for RQ (Redis Queue)"
DESCRIPTION = "Django integration with RQ, a Redis based Python queuing library. \
Django-RQ is a simple app that allows you to configure your queues \
in django's settings.py and easily use them in your project."
LICENSE = "MIT"

PV = "4.1.1"

RPM_NAME = "python314-django-rq-4.1.1-1.1.noarch.rpm"
RPM_HASH = "3fbd60ab377653cd62282b0a1fa540a1868d82343926831eb18d14c95081273b14784af0bc7f58c716b6d540a77fc1638b98daf453791b65c3c670cbd743150d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-rq \
python314-django-rq \
python3dist-django-rq"

RDEPENDS:${PN} += "python-abi \
python314-Django \
python314-redis \
python314-rq"

inherit rpm
