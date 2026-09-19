SUMMARY = "Distutils/Setuptools Adapter"
DESCRIPTION = "This package adds support for common build additions to distutils. \
This includes the following: \
 \
  * gettext/i18n \
  * documentation \
  * program icons"
LICENSE = "GPL-2.0-only"

PV = "3.0"

RPM_NAME = "python314-distutils-extra-3.0-3.5.noarch.rpm"
RPM_HASH = "15c389f546df04d2211f1377269bbfc2dd36fe22ded16ebc9f8699d3e75a38ab2403473a1bc2b20d0835deebc3334709029d691309c7d305d49361425dd1ff6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-distutils-extra \
python314-distutils-extra \
python3dist-python-distutils-extra"

RDEPENDS:${PN} += "python-abi \
python314-setuptools"

inherit rpm
