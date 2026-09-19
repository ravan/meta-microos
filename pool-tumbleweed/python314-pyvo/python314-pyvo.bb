SUMMARY = "Astropy affiliated package for accessing Virtual Observatory data and services"
DESCRIPTION = "Astropy affiliated package for accessing Virtual Observatory data and services"
LICENSE = "BSD-3-Clause"

PV = "1.8.1"

RPM_NAME = "python314-pyvo-1.8.1-1.3.noarch.rpm"
RPM_HASH = "df1449eb5276a7ed435cc6d368cbfaeed509c752903cd9d074ec546bc3e13b44dd016d233c659409da0e6fd2e10d2aeb4cc0913da7d3f597d3eeb15b82982899"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyvo \
python314-pyvo \
python3dist-pyvo"

RDEPENDS:${PN} += "python-abi \
python314-astropy \
python314-requests"

inherit rpm
