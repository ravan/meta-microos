SUMMARY = "A skin for the Django Admin-Interface"
DESCRIPTION = "A jazzy skin for the Django Admin-Interface."
LICENSE = "BSD-2-Clause & LGPL-2.1-or-later"

PV = "5.0.0"

RPM_NAME = "python314-django-grappelli-5.0.0-1.2.noarch.rpm"
RPM_HASH = "ad9d357ad89ad307a7ebdf6eae8eb801d986dbbd3741ee98d154c4f218fda03e09d0bc1e4a6a7ef333314cc4d7573b495aaa2e421ab96787cd2ff9e2b304579a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-grappelli \
python314-django-grappelli \
python3dist-django-grappelli"

RDEPENDS:${PN} += "python-abi \
python314-Django"

inherit rpm
