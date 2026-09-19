SUMMARY = "Microsoft Azure Communication Job Router Client Library for Python"
DESCRIPTION = "This package contains a Python SDK for Azure Communication Services for JobRouter."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python314-azure-communication-jobrouter-1.0.0~b1-2.9.noarch.rpm"
RPM_HASH = "da754202504de66b73278b16217554af7b6316c078fb2e0a1c9982498e909fa8e9b024771aacce413b419cc5be287f077af05f0b1302b898da44f27b18d55982"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-communication-jobrouter \
python314-azure-communication-jobrouter \
python3dist-azure-communication-jobrouter"

RDEPENDS:${PN} += "-python314-azure-core >= 1.25.0 with python314-azure-core < 2.0.0 \
python-abi \
python314-azure-communication-nspkg \
python314-azure-nspkg \
python314-dateutil \
python314-msrest"

inherit rpm
