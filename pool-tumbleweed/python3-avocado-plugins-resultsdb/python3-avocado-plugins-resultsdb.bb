SUMMARY = "Avocado plugin to propagate job results to ResultsDB"
DESCRIPTION = "Allows Avocado to send job results directly to a ResultsDB \
server."
LICENSE = "GPL-2.0-only"

PV = "113.0"

RPM_NAME = "python3-avocado-plugins-resultsdb-113.0-1.2.noarch.rpm"
RPM_HASH = "7dcc0b1491a390ec0289ec49e09a2bc41ac4dcf12d11fe74def04d961827e25a12098806cf23d1d8c99ba33518dcf91b300f1fd053bba04f5c30337a47407646"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-avocado-plugins-resultsdb \
python3.13dist-avocado-framework-plugin-resultsdb \
python3dist-avocado-framework-plugin-resultsdb"

RDEPENDS:${PN} += "python-abi \
python3-avocado \
python3-resultsdb-api"

inherit rpm
