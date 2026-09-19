SUMMARY = "Compatibility library for Django"
DESCRIPTION = "Version checking library for Django."
LICENSE = "GPL-2.0-only | LGPL-2.1-or-later"

PV = "0.2.7"

RPM_NAME = "python313-django-nine-0.2.7-3.5.noarch.rpm"
RPM_HASH = "566d6b7eba63993ae829c73f2fa965d37b1abed37f167eda94c90d12b09b30ca73cfe91e9c6dbaed2c6ffa68fab40252c42840883a70dfb872080a80f38b081b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-nine \
python3.13dist-django-nine \
python313-django-nine \
python3dist-django-nine"

RDEPENDS:${PN} += "python-abi \
python313-packaging"

inherit rpm
