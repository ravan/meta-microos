SUMMARY = "Microsoft Azure Communication Call Automation Client Library for Python"
DESCRIPTION = "This package contains a Python SDK for Azure Communication Call Automation. \
Call Automation provides developers the ability to build server-based, \
intelligent call workflows, and call recording for voice and PSTN channels."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python314-azure-communication-callautomation-1.6.0-1.2.noarch.rpm"
RPM_HASH = "ef595127556d898e102e4705d12786da8d265302c4a9c915f1e509351f7284be607491993c08ba0c4e0d01638e5fa5a7927a180d7a8246822fed8fc54a8639bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-communication-callautomation \
python314-azure-communication-callautomation \
python3dist-azure-communication-callautomation"

RDEPENDS:${PN} += "-python314-azure-core >= 1.30.0 with python314-azure-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-communication-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
