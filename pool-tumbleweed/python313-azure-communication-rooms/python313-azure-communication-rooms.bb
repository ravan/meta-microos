SUMMARY = "Microsoft Communication Rooms Client Library for Python"
DESCRIPTION = "This package contains a Python SDK for Azure Communication Services for Rooms."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python313-azure-communication-rooms-1.2.0-1.5.noarch.rpm"
RPM_HASH = "36f46dc988f56369a5952b44a15c05cc0b0b83e2d707f843ba2b618909a64388ec2084e412d98b3bc89c712c877dbdc48ef05535edc61d29d3ffe5129b6253d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-communication-rooms \
python3.13dist-azure-communication-rooms \
python313-azure-communication-rooms \
python3dist-azure-communication-rooms"

RDEPENDS:${PN} += "-python313-azure-core >= 1.32.0 with python313-azure-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-communication-nspkg \
python313-azure-nspkg"

inherit rpm
