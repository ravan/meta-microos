SUMMARY = "Azure Communication Email client library for Python"
DESCRIPTION = "This package contains a Python SDK for Azure Communication Services for Email. \
Key concepts \
 \
The Azure Communication Email package is used to do following: \
 \
 * Send emails to multiple types of recipients \
 * Query the status of a sent email message"
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python314-azure-communication-email-1.1.0-1.4.noarch.rpm"
RPM_HASH = "8b52932ebb7b3906a6e7bac4e6b9c5d951ceb276f57331690061d8702430e17a5a5c2f53e10281ee6762c12b94a65f1168d0aab1fafa15669045c95f3b567eb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-communication-email \
python314-azure-communication-email \
python3dist-azure-communication-email"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-core >= 1.30.0 with python314-azure-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-communication-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
