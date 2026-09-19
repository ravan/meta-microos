SUMMARY = "Fuzzy string matching in python"
DESCRIPTION = "Fuzzy string matching in python"
LICENSE = "GPL-2.0-only"

PV = "0.18.0"

RPM_NAME = "python313-fuzzywuzzy-0.18.0-3.5.noarch.rpm"
RPM_HASH = "cb80ac1168d19f9fa6289b4fbaaa86ec08b1503ee00a5289ea2cd37fe40d107d9eebe8820922dffc391c10e9bbb6cbf835ddaf6c13ac49c7993dd7ead318129c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fuzzywuzzy \
python3.13dist-fuzzywuzzy \
python313-fuzzywuzzy \
python3dist-fuzzywuzzy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
