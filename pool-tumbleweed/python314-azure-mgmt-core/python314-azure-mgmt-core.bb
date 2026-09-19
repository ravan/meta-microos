SUMMARY = "Microsoft Azure Management Core Library"
DESCRIPTION = "This is the Microsoft Azure Management Core Library. \
 \
Azure management core library defines extensions to Azure Core that are specific \
to ARM (Azure Resource Management) needed when you use client libraries. \
 \
As an end user, you don't need to manually install azure-mgmt-core because it will \
be installed automatically when you install other SDKs."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python314-azure-mgmt-core-1.6.0-1.5.noarch.rpm"
RPM_HASH = "0caffdec22918825b1787bf51a3588b009d1aeaf1673b7f070da032f906c9520151ba7b2b75ee675b3f95c79648e6076965b7c00bd51330992eebd6572a3d416"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-core \
python314-azure-mgmt-core \
python3dist-azure-mgmt-core"

RDEPENDS:${PN} += "-python314-azure-core >= 1.32.0 with python314-azure-core < 2.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg"

inherit rpm
