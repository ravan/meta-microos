SUMMARY = "Distutils/Setuptools Adapter"
DESCRIPTION = "This package adds support for common build additions to distutils. \
This includes the following: \
 \
  * gettext/i18n \
  * documentation \
  * program icons"
LICENSE = "GPL-2.0-only"

PV = "3.0"

RPM_NAME = "python313-distutils-extra-3.0-3.5.noarch.rpm"
RPM_HASH = "00c545a24277beb7b662c69f35e99269e57e718cab8a492f57f2ce100ddb3eb9a781ec44ed37b6c021a9cd0ab9097a9c6af04229d83a7e2589c5bfad93dce2d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-distutils-extra \
python3.13dist-python-distutils-extra \
python313-distutils-extra \
python3dist-python-distutils-extra"

RDEPENDS:${PN} += "python-abi \
python313-setuptools"

inherit rpm
