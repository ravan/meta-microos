SUMMARY = "Versioning It with your Version In Git"
DESCRIPTION = "Python Setuptools plugin for automatically determining your package's version \
based on your version control repository's tags. Unlike others, it allows easy \
customization of the version format and even lets you easily override the \
separate functions used for version extraction & calculation."
LICENSE = "MIT"

PV = "3.3.0"

RPM_NAME = "python314-versioningit-3.3.0-1.5.noarch.rpm"
RPM_HASH = "0e8145b6df0896f8a5bb1e0fb10f322c14926c5719df6a79459a56fbefb3d2f3f0c33df2e8be83fdf55b88403b7825aff07103644a09df3486c7f0a92ea10456"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-versioningit \
python314-versioningit \
python3dist-versioningit"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-packaging \
python314-tomli"

inherit rpm
