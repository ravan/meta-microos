SUMMARY = "Django utility application that returns client's real IP address"
DESCRIPTION = "A Django utility application that returns client's real IP address."
LICENSE = "MIT"

PV = "7.0.1"

RPM_NAME = "python313-django-ipware-7.0.1-1.2.noarch.rpm"
RPM_HASH = "4c159f47a97dca0888f89a4c8fcb6231e5dec368eb8a84c427c2137a72fd7129cd7d94decbfda89d8ec98720098af9b00aa057e1e333c9e33869f34d30f524b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-ipware \
python3.13dist-django-ipware \
python313-django-ipware \
python3dist-django-ipware"

RDEPENDS:${PN} += "python-abi \
python313-Django \
python313-python-ipware"

inherit rpm
