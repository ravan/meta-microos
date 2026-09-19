SUMMARY = "A simple statsd client"
DESCRIPTION = "statsd is a front-end to Graphite. This is a Python client \
for the statsd daemon."
LICENSE = "MIT"

PV = "4.0.1"

RPM_NAME = "python313-statsd-4.0.1-1.8.noarch.rpm"
RPM_HASH = "9122a1001c7d4b259abb75c272b722486fc3c06bbcf83618b845ea68c9d6def93cb978fb7134bae5927ac8174a042d388b654bef40ba05b31197fb4c4406239a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-statsd \
python3.13dist-statsd \
python313-statsd \
python3dist-statsd"

RDEPENDS:${PN} += "python-abi"

inherit rpm
