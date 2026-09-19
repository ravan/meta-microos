SUMMARY = "Django allauth - Saml provider"
DESCRIPTION = "Python extra dependency `saml` for python-django-allauth."
LICENSE = "MIT"

PV = "65.19.1"

RPM_NAME = "python314-django-allauth-saml-65.19.1-1.1.noarch.rpm"
RPM_HASH = "0f1388802d46c09a42faa7ae97ac83af62744853a3ff67e1b2519130af346ed60109c1a178e88869363b57addb0b72289325057ef8e0d1d32fcf2b2ab24c5d4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-django-allauth-saml"

RDEPENDS:${PN} += "python314-django-allauth \
python314-python3-saml"

inherit rpm
