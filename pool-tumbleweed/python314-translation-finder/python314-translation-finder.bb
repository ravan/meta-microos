SUMMARY = "Translation Files Finder"
DESCRIPTION = "A translation file finder for Weblate, translation tool with tight version control integration."
LICENSE = "GPL-3.0-or-later"

PV = "2.24"

RPM_NAME = "python314-translation-finder-2.24-1.3.noarch.rpm"
RPM_HASH = "72710121976ff0c8bf7ccd9fbccc038985a1048a80eb44b64428f82b611673018eed7f055e0e03bc22dc00611c3fe8c228f70c626c3904451e35ed1e64f0aafe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-translation-finder \
python314-translation-finder \
python3dist-translation-finder"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-charset-normalizer \
python314-ruamel.yaml \
python314-weblate-language-data \
update-alternatives"

inherit rpm
