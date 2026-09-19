SUMMARY = "OpenStack i18n library"
DESCRIPTION = "The oslo.i18n library contain utilities for working with internationalization \
(i18n) features, especially translation for text strings in an application \
or library."
LICENSE = "Apache-2.0"

PV = "6.9.0"

RPM_NAME = "python313-oslo.i18n-6.9.0-1.1.noarch.rpm"
RPM_HASH = "3de3032ae61ddddcb053e3d29c1b7f43fa497e607782dfa50dc5c0f322c7515bbc87aab0bcf79c0c6ae93cfad6989bd7192867e0f2107174705cc5a536df2091"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oslo.i18n \
python3.13dist-oslo.i18n \
python313-oslo.i18n \
python3dist-oslo.i18n"

RDEPENDS:${PN} += "python-abi"

inherit rpm
