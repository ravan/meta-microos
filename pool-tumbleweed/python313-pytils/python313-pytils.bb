SUMMARY = "A Russian-specific string utility module"
DESCRIPTION = "Tools for processing strings in Russian (choosing proper form for plurals, \
in-words representation of numerals, dates in Russian without locales, \
transliteration, etc.)"
LICENSE = "MIT"

PV = "0.4.4"

RPM_NAME = "python313-pytils-0.4.4-1.5.noarch.rpm"
RPM_HASH = "91c36ba8ab6104d4e211d5bf03d145907f46cc59c3cfa728e293dd4506a436d201c6260ff653c11003c14fc48faacb690dd667a749b29b70bdfc5b3a74ba26ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytils \
python3.13dist-pytils \
python313-pytils \
python3dist-pytils"

RDEPENDS:${PN} += "python-abi"

inherit rpm
