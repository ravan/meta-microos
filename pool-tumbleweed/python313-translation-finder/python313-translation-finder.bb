SUMMARY = "Translation Files Finder"
DESCRIPTION = "A translation file finder for Weblate, translation tool with tight version control integration."
LICENSE = "GPL-3.0-or-later"

PV = "2.24"

RPM_NAME = "python313-translation-finder-2.24-1.3.noarch.rpm"
RPM_HASH = "94c9248577a46a1223fbcee82fa065ae9485b0e7b065dc14f6f71343f452e3c4f408eb5910802e0d6e022bcc5e91923d98001ee0d539a2fe5a2dcd1b6af0005e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-translation-finder \
python3.13dist-translation-finder \
python313-translation-finder \
python3dist-translation-finder"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-charset-normalizer \
python313-ruamel.yaml \
python313-weblate-language-data \
update-alternatives"

inherit rpm
