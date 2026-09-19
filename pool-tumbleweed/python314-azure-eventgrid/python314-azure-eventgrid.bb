SUMMARY = "Microsoft Azure Event Grid Client Library"
DESCRIPTION = "This is the Microsoft Azure Event Grid Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "4.22.1"

RPM_NAME = "python314-azure-eventgrid-4.22.1-1.1.noarch.rpm"
RPM_HASH = "bf6fc9628e7045dc050c74fe223af1507034f6cd92835b28dfc59e4a27efaa2c2763de6ce99b0fce728c078472d493e01ce59f330e7eedebddce13bca174d1e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-eventgrid \
python314-azure-eventgrid \
python3dist-azure-eventgrid"

RDEPENDS:${PN} += "-python314-azure-core >= 1.30.0 with python314-azure-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-nspkg"

inherit rpm
