SUMMARY = "A web user interface for GNU Mailman"
DESCRIPTION = "A web user interface for GNU Mailman"
LICENSE = "GPL-3.0-only"

PV = "1.3.13"

RPM_NAME = "postorius-1.3.13-8.1.noarch.rpm"
RPM_HASH = "1677eb118c0cfbe82e1d625b89982174f4c8f83a2ce3cea61acc2a330f617652bc6d45757d2aaa8af9971ecf511fe23b3afc6959949023c5e37caa27c7438998"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postorius \
python3.13dist-postorius \
python313-postorius \
python3dist-postorius"

RDEPENDS:${PN} += "-python313-Django >= 4.2 with python313-Django < 5.3 \
python-abi \
python313-django-debug-toolbar \
python313-django-mailman3 \
python313-django-requests-debug-toolbar \
python313-legacy-cgi \
python313-mailmanclient \
python313-readme-renderer"

inherit rpm
