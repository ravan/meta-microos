SUMMARY = "Bootstrap support for Django projects"
DESCRIPTION = "Bootstrap support for Django projects."
LICENSE = "BSD-3-Clause"

PV = "26.1"

RPM_NAME = "python313-django-bootstrap3-26.1-1.3.noarch.rpm"
RPM_HASH = "9a5795eab8dde4ded47bce459bd1c2a17433299c7ca21a051570a2442f2b3218af279428930ab46b436e861108ee512e8371bc836ffcd51c0b96f8e345d56257"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-bootstrap3 \
python3.13dist-django-bootstrap3 \
python313-django-bootstrap3 \
python3dist-django-bootstrap3"

RDEPENDS:${PN} += "python-abi \
python313-Django"

inherit rpm
