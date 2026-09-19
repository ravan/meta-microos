SUMMARY = "Statistics for each tag's set of key phrases"
DESCRIPTION = "A module to compute the statistics of each tag's set of key phrases \
over input lines in Python 3."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python314-TagStats-0.1.2-5.5.noarch.rpm"
RPM_HASH = "4250cde8ca342514c1ad9a6e9127fdad2b6d968ce8aa87b0feee1faae4d913756fcd195546fe734ad2dd2b6c93b36220644eb5c2db2b9e18bfcdea445b13009e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-tagstats \
python314-TagStats \
python3dist-tagstats"

RDEPENDS:${PN} += "python-abi"

inherit rpm
