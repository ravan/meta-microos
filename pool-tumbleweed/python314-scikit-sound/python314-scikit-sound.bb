SUMMARY = "Python utilities for working with sound signals"
DESCRIPTION = "Scikit-sound contains functions for working with sound"
LICENSE = "BSD-2-Clause"

PV = "0.2.13"

RPM_NAME = "python314-scikit-sound-0.2.13-1.12.noarch.rpm"
RPM_HASH = "43e762c5fff26ff663cc5f95bcf76cb46177ba4b5b5cbaf97927ebf295082510f8985d59aa38adc8e466e69a66976ded5103422d52b70a0a7ed1668ac8a8ffa4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-scikit-sound \
python314-scikit-sound \
python3dist-scikit-sound"

RDEPENDS:${PN} += "python-abi \
python314-PyYAML \
python314-appdirs \
python314-docutils \
python314-pygame \
python314-scipy"

inherit rpm
