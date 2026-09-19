SUMMARY = "Backend of Django-Haystack for the Xapian search engine"
DESCRIPTION = "Xapian-haystack is a backend of Django-Haystack for the Xapian search engine."
LICENSE = "GPL-2.0-only"

PV = "3.1.0"

RPM_NAME = "python313-xapian-haystack-3.1.0-3.7.noarch.rpm"
RPM_HASH = "8a6cdd0afc369454ca403327cea537b7b5353d4909d2e9c697cfd7e5fc50d8eb0e3a72b30d370ab08a5d4610835c331436dbeabcb61026471727080b35b5dc5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xapian-haystack \
python3.13dist-xapian-haystack \
python313-xapian-haystack \
python3dist-xapian-haystack"

RDEPENDS:${PN} += "python-abi \
python313-Django \
python313-django-haystack \
python313-filelock"

inherit rpm
