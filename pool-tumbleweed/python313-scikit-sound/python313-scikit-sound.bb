SUMMARY = "Python utilities for working with sound signals"
DESCRIPTION = "Scikit-sound contains functions for working with sound"
LICENSE = "BSD-2-Clause"

PV = "0.2.13"

RPM_NAME = "python313-scikit-sound-0.2.13-1.12.noarch.rpm"
RPM_HASH = "f34a19e6411e741e9ebd0416b855a80ad1c094a35879af158259260977f92793917f88b563af6e00a78dd428c7b59462b11b00de4497e01b37529274efa68f3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-scikit-sound \
python3.13dist-scikit-sound \
python313-scikit-sound \
python3dist-scikit-sound"

RDEPENDS:${PN} += "python-abi \
python313-PyYAML \
python313-appdirs \
python313-docutils \
python313-pygame \
python313-scipy"

inherit rpm
