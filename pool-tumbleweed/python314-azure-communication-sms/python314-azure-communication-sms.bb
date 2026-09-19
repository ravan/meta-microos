SUMMARY = "Microsoft Azure Communication SMS Client Library for Python"
DESCRIPTION = "Azure Communication SMS client package is intended to be used to send SMS using an Azure Resource."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python314-azure-communication-sms-1.1.0-1.9.noarch.rpm"
RPM_HASH = "e0253ee2c9940370ec9c61d40c10d2c84de8700a4712f8effa03132d74bde9efd95efd8c1e326373f0fd94f97149c54dda020cfc456ec3fc3cb8039a7d7c9588"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-communication-sms \
python314-azure-communication-sms \
python3dist-azure-communication-sms"

RDEPENDS:${PN} += "-python314-azure-core >= 1.27.0 with python314-azure-core < 2.0.0 \
python-abi \
python314-azure-communication-nspkg \
python314-azure-nspkg \
python314-msrest"

inherit rpm
