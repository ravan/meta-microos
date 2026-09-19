SUMMARY = "Python Social Authentication, Django integration"
DESCRIPTION = "This is the Django component of the python-social-auth ecosystem, \
it implements the needed functionality to integrate social-auth-core \
in a Django based project."
LICENSE = "BSD-3-Clause"

PV = "5.9.0"

RPM_NAME = "python314-social-auth-app-django-5.9.0-1.2.noarch.rpm"
RPM_HASH = "8ed51e6efff00d85345082c4fd74a1353d5df58c91785fcc953bdc656f00093ae237b599580698807b5751135bec8bc496f576506c7a74203fa01c6b1a952826"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-social-auth-app-django \
python314-social-auth-app-django \
python3dist-social-auth-app-django"

RDEPENDS:${PN} += "python-abi \
python314-Django \
python314-asgiref \
python314-social-auth-core"

inherit rpm
