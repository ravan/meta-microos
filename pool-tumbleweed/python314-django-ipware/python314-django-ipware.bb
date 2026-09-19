SUMMARY = "Django utility application that returns client's real IP address"
DESCRIPTION = "A Django utility application that returns client's real IP address."
LICENSE = "MIT"

PV = "7.0.1"

RPM_NAME = "python314-django-ipware-7.0.1-1.2.noarch.rpm"
RPM_HASH = "19a8927d098a3815b9b07142ab4b3c6ecbfd54f97ffd63800514f0cb58ccf6b6a2ca6499b3af8adaa68df2e982f6b8dfd4a9ca907e7b46cffab18d17c3f96773"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-ipware \
python314-django-ipware \
python3dist-django-ipware"

RDEPENDS:${PN} += "python-abi \
python314-Django \
python314-python-ipware"

inherit rpm
