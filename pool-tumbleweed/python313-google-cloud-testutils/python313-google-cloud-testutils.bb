SUMMARY = "Common tools used to test Python client libraries for Google APIs"
DESCRIPTION = "This is a collection of common tools used in system tests of Python client \
libraries for Google APIs. It provides utilities for prefixing test resources, \
managing test cleanup, and other common testing tasks."
LICENSE = "Apache-2.0"

PV = "1.9.1"

RPM_NAME = "python313-google-cloud-testutils-1.9.1-1.1.noarch.rpm"
RPM_HASH = "e3f3f5ab726674506187759b9fc3a61a3632beab20e53092956c1a6ba3998fcb474a2a1f35ae92b1a47e2b818e2ee92314b8196de65292eaedc7b91e282b20f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-cloud-testutils \
python3.13dist-google-cloud-testutils \
python313-google-cloud-testutils \
python3dist-google-cloud-testutils"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-click \
python313-google-auth \
python313-packaging \
update-alternatives"

inherit rpm
