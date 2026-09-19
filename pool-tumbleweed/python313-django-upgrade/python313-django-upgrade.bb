SUMMARY = "Automatically upgrade your Django projects"
DESCRIPTION = "Automatically upgrade your Django projects."
LICENSE = "MIT"

PV = "1.30.0"

RPM_NAME = "python313-django-upgrade-1.30.0-1.3.noarch.rpm"
RPM_HASH = "32c2a7f407f7ae6c9c5d616b215b42dfb263223b93e2ad9b5c3156faad30b7fbe0de24c1b8ed72a7b698d23e69839d5396ab7e2bb85c3081fbc958c16421247f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-upgrade \
python3.13dist-django-upgrade \
python313-django-upgrade \
python3dist-django-upgrade"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-tokenize-rt \
update-alternatives"

inherit rpm
