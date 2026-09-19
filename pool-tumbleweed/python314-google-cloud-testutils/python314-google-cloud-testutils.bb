SUMMARY = "Common tools used to test Python client libraries for Google APIs"
DESCRIPTION = "This is a collection of common tools used in system tests of Python client \
libraries for Google APIs. It provides utilities for prefixing test resources, \
managing test cleanup, and other common testing tasks."
LICENSE = "Apache-2.0"

PV = "1.9.1"

RPM_NAME = "python314-google-cloud-testutils-1.9.1-1.1.noarch.rpm"
RPM_HASH = "0e6f72dc2d107fb7554e49bdb73611d8f436a3a182f703b87ff982d0b4bea8db8438c0fec33303e638f58a9b17f4bb93ab4621a824459d2b7606be0dfe646142"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-google-cloud-testutils \
python314-google-cloud-testutils \
python3dist-google-cloud-testutils"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-click \
python314-google-auth \
python314-packaging \
update-alternatives"

inherit rpm
