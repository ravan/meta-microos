SUMMARY = "Microsoft Azure Event Grid Client Library"
DESCRIPTION = "This is the Microsoft Azure Event Grid Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "4.22.1"

RPM_NAME = "python313-azure-eventgrid-4.22.1-1.1.noarch.rpm"
RPM_HASH = "4c8e3904443ac221dad00343def18add4947dc959c34e89fbe4216ec1d1ef9cba26e44e578f6b07de05187cebd60256364c1ef55bffcda49f1d736ea0f7d242b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-eventgrid \
python3.13dist-azure-eventgrid \
python313-azure-eventgrid \
python3dist-azure-eventgrid"

RDEPENDS:${PN} += "-python313-azure-core >= 1.30.0 with python313-azure-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-nspkg"

inherit rpm
