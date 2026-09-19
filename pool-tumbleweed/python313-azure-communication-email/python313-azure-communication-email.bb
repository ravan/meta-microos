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

RPM_NAME = "python313-azure-communication-email-1.1.0-1.4.noarch.rpm"
RPM_HASH = "59be0688dd51f11c010a3dc83107b7e87b5dde1a97aad795afd76f3a707c95d0993f8b27a88dfe8805b9511a3d96b358f19618802dd2111b3f1d0a12bf56ffea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-communication-email \
python3.13dist-azure-communication-email \
python313-azure-communication-email \
python3dist-azure-communication-email"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-core >= 1.30.0 with python313-azure-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-communication-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
