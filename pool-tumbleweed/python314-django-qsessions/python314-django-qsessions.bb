SUMMARY = "Extended session backends for Django"
DESCRIPTION = "Extended session backends for Django."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python314-django-qsessions-2.1.0-1.3.noarch.rpm"
RPM_HASH = "1dd89cc5eb80b56aab7f4967b66b455189da99d57613034fe924022ebaecbc878a0bea802b1475e4e55ef19e22fedcf2a5b173fe9e4103993a4cfdcc7c1a6e17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-qsessions \
python314-django-qsessions \
python3dist-django-qsessions"

RDEPENDS:${PN} += "python-abi \
python314-Django \
python314-ua-parser"

inherit rpm
