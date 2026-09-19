SUMMARY = "Collections of libCST codemodders to upgrade Django"
DESCRIPTION = "Collections of libCST codemodders to upgrade Django."
LICENSE = "MIT"

PV = "2.4.5"

RPM_NAME = "python313-django-codemod-2.4.5-1.4.noarch.rpm"
RPM_HASH = "70badbd4951bc77b510d8166a8be2eb4a0c00bc67ed1974f286eb7b5058ac22d2b50b0e7c5f983665c66029e013c753498c8185a1150d3326afcf285fe768c26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-codemod \
python3.13dist-django-codemod \
python313-django-codemod \
python3dist-django-codemod"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-click \
python313-libcst \
python313-pathspec \
python313-rich \
python313-rich-click \
update-alternatives"

inherit rpm
