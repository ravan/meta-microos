SUMMARY = "Backend of Django-Haystack for the Xapian search engine"
DESCRIPTION = "Xapian-haystack is a backend of Django-Haystack for the Xapian search engine."
LICENSE = "GPL-2.0-only"

PV = "3.1.0"

RPM_NAME = "python314-xapian-haystack-3.1.0-3.7.noarch.rpm"
RPM_HASH = "8ae26adb5f032cfc66ee5c2ecee2ec7fadfc8761897e9427d8edd7f3d6ab7cfaf448664a4b23bb994f0666fa588671e82b5ff106a471223b8815c40e343d1b1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-xapian-haystack \
python314-xapian-haystack \
python3dist-xapian-haystack"

RDEPENDS:${PN} += "python-abi \
python314-Django \
python314-django-haystack \
python314-filelock"

inherit rpm
