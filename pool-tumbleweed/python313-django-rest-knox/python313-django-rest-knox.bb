SUMMARY = "Authentication for Django REST framework"
DESCRIPTION = "Authentication for Django REST framework."
LICENSE = "MIT"

PV = "5.0.2"

RPM_NAME = "python313-django-rest-knox-5.0.2-2.5.noarch.rpm"
RPM_HASH = "b1b8b178003abfa8a57666fb5e6fd5acd46b10641b78fd1f7f873a6537b919a8ea470798fd077c0ef9cec9ed272899e071e02d6496f1aba37c75383e5f03726f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-rest-knox \
python3.13dist-django-rest-knox \
python313-django-rest-knox \
python3dist-django-rest-knox"

RDEPENDS:${PN} += "python-abi \
python313-Django \
python313-cryptography \
python313-djangorestframework"

inherit rpm
