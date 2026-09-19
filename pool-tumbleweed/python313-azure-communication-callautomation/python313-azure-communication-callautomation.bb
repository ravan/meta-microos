SUMMARY = "Microsoft Azure Communication Call Automation Client Library for Python"
DESCRIPTION = "This package contains a Python SDK for Azure Communication Call Automation. \
Call Automation provides developers the ability to build server-based, \
intelligent call workflows, and call recording for voice and PSTN channels."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python313-azure-communication-callautomation-1.6.0-1.2.noarch.rpm"
RPM_HASH = "72d1fcb0576be50b05088f9703904cb053ef4e6c466c974b8196cbac57b843800368e83604b25d880172fb94c3906548011070cc4e407ab3c4ef1876cf7cb850"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-communication-callautomation \
python3.13dist-azure-communication-callautomation \
python313-azure-communication-callautomation \
python3dist-azure-communication-callautomation"

RDEPENDS:${PN} += "-python313-azure-core >= 1.30.0 with python313-azure-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-communication-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
