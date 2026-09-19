SUMMARY = "Collections of libCST codemodders to upgrade Django"
DESCRIPTION = "Collections of libCST codemodders to upgrade Django."
LICENSE = "MIT"

PV = "2.4.5"

RPM_NAME = "python314-django-codemod-2.4.5-1.4.noarch.rpm"
RPM_HASH = "ec4a9f07ed319ef125152c5c71820049366ec5a8a4ea0094ab07029cb85ac23d551f947762ae16f703c7a39e15231c62b11741b55ad9a54b9bff6d49b0db2632"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-codemod \
python314-django-codemod \
python3dist-django-codemod"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-click \
python314-libcst \
python314-pathspec \
python314-rich \
python314-rich-click \
update-alternatives"

inherit rpm
