SUMMARY = "A Russian-specific string utility module"
DESCRIPTION = "Tools for processing strings in Russian (choosing proper form for plurals, \
in-words representation of numerals, dates in Russian without locales, \
transliteration, etc.)"
LICENSE = "MIT"

PV = "0.4.4"

RPM_NAME = "python314-pytils-0.4.4-1.5.noarch.rpm"
RPM_HASH = "682b8734204a596947244f1edc713b755ba0c6ec49cb7cd300843e0587437e727a901cb4931c5e73b76e2cdb2ff20d0516f979f47eab392474190acb3a8d9307"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytils \
python314-pytils \
python3dist-pytils"

RDEPENDS:${PN} += "python-abi"

inherit rpm
