SUMMARY = "Fuzzy string matching in python"
DESCRIPTION = "Fuzzy string matching in python"
LICENSE = "GPL-2.0-only"

PV = "0.18.0"

RPM_NAME = "python314-fuzzywuzzy-0.18.0-3.5.noarch.rpm"
RPM_HASH = "89bb553e6504d6da10e2c5c13a1fd690ef56e82d8be2acf2f1aa5cd25f82436f186f3309ff8b78c02f4abe006a526259e2f0b7a6a39096c390177ee23ca30e1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-fuzzywuzzy \
python314-fuzzywuzzy \
python3dist-fuzzywuzzy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
