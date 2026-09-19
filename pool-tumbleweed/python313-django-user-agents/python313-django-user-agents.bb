SUMMARY = "Django identification of visitors information"
DESCRIPTION = "A django package that allows easy identification of visitor's browser, OS and device information, \
including whether the visitor uses a mobile phone, tablet or a touch capable device. Under the hood, \
it uses `user-agents <https://github.com/selwin/python-user-agents>`_."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python313-django-user-agents-0.4.0-3.5.noarch.rpm"
RPM_HASH = "7a7383105edd2484278ee5fce76d32efeeebf1ecc2ad23022674e89ef57ccf78dcd3e4e9604f258ef32bc2d675a587b5564c25eeae42c45f5c907d02f2b05f7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-user-agents \
python3.13dist-django-user-agents \
python313-django-user-agents \
python3dist-django-user-agents"

RDEPENDS:${PN} += "python-abi \
python313-Django \
python313-user-agents"

inherit rpm
