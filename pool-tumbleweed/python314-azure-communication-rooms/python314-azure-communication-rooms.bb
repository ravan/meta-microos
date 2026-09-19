SUMMARY = "Microsoft Communication Rooms Client Library for Python"
DESCRIPTION = "This package contains a Python SDK for Azure Communication Services for Rooms."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python314-azure-communication-rooms-1.2.0-1.5.noarch.rpm"
RPM_HASH = "e838456a870cd563baa0bd15fc340bcfef19b2d23255288fbc285992c73554a0f96c54adc3bd44c2010c9ef2fc0654c448015fd4ea9b68dc3c54845e1cdcb9d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-communication-rooms \
python314-azure-communication-rooms \
python3dist-azure-communication-rooms"

RDEPENDS:${PN} += "-python314-azure-core >= 1.32.0 with python314-azure-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-communication-nspkg \
python314-azure-nspkg"

inherit rpm
