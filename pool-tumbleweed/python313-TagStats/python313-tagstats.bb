SUMMARY = "Statistics for each tag's set of key phrases"
DESCRIPTION = "A module to compute the statistics of each tag's set of key phrases \
over input lines in Python 3."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python313-TagStats-0.1.2-5.5.noarch.rpm"
RPM_HASH = "52e02257ebf5fb0c2afcefb43fe5a4a6d7eaa18d39e85813e429ba495478523df998ebef8644f226cf4c28085e88131f161b05c6cd66967014a96552eaa07348"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-TagStats \
python3.13dist-tagstats \
python313-TagStats \
python3dist-tagstats"

RDEPENDS:${PN} += "python-abi"

inherit rpm
