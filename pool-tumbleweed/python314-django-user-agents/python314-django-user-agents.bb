SUMMARY = "Django identification of visitors information"
DESCRIPTION = "A django package that allows easy identification of visitor's browser, OS and device information, \
including whether the visitor uses a mobile phone, tablet or a touch capable device. Under the hood, \
it uses `user-agents <https://github.com/selwin/python-user-agents>`_."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python314-django-user-agents-0.4.0-3.5.noarch.rpm"
RPM_HASH = "d6503e01b8fe0bdb8af148de63484a5c0d9796f847bef0b68f4dab2636d9cc7591ac11c53dd74e347c0c2e094acaa4c429f9ba5616cbf0e763b4b7fd2afc7b6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-user-agents \
python314-django-user-agents \
python3dist-django-user-agents"

RDEPENDS:${PN} += "python-abi \
python314-Django \
python314-user-agents"

inherit rpm
