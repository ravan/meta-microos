SUMMARY = "Django allauth - Saml provider"
DESCRIPTION = "Python extra dependency `saml` for python-django-allauth."
LICENSE = "MIT"

PV = "65.19.1"

RPM_NAME = "python313-django-allauth-saml-65.19.1-1.1.noarch.rpm"
RPM_HASH = "fdf7f9fffb3f6bda51a46276cf3233be89e78394056917ca39d1ec00a7a03d5bb07f71143d6e7e6a95f02115cfd174d94b3b1ab3bc9cd07de6cc5e05f40e5172"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-allauth-saml \
python313-django-allauth-saml"

RDEPENDS:${PN} += "python313-django-allauth \
python313-python3-saml"

inherit rpm
