SUMMARY = "Compatibility library for Django"
DESCRIPTION = "Version checking library for Django."
LICENSE = "GPL-2.0-only | LGPL-2.1-or-later"

PV = "0.2.7"

RPM_NAME = "python314-django-nine-0.2.7-3.5.noarch.rpm"
RPM_HASH = "57bb3b2a98f26c41f7d70ae85e175aef9b99cd798f14bc9b8d92dd75eae9a3822181da8a8c6e1fd40582090ea8c568a64f4491dcb649414a8d03530c751281a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-nine \
python314-django-nine \
python3dist-django-nine"

RDEPENDS:${PN} += "python-abi \
python314-packaging"

inherit rpm
