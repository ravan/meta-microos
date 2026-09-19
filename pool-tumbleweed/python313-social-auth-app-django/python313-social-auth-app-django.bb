SUMMARY = "Python Social Authentication, Django integration"
DESCRIPTION = "This is the Django component of the python-social-auth ecosystem, \
it implements the needed functionality to integrate social-auth-core \
in a Django based project."
LICENSE = "BSD-3-Clause"

PV = "5.9.0"

RPM_NAME = "python313-social-auth-app-django-5.9.0-1.2.noarch.rpm"
RPM_HASH = "7d72301e325cf5550eede6e5e8de1fcec3cfe2f463a4bbeb885026d53feec57afde3929309b2984e1404d32214cfb3fe2240727e832dc616b706818ca231cea0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-social-auth-app-django \
python3.13dist-social-auth-app-django \
python313-social-auth-app-django \
python3dist-social-auth-app-django"

RDEPENDS:${PN} += "python-abi \
python313-Django \
python313-asgiref \
python313-social-auth-core"

inherit rpm
