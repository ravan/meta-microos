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

RPM_NAME = "python313-azure-mgmt-core-1.6.0-1.5.noarch.rpm"
RPM_HASH = "9a66e062f2ac1ed06c7894c93fa6c28cf3147a965436066bc6bb3d5bb23e562dd6bdde84b506e68a8212e443f0186913ab58bda98be8e698ed9bc4ef8ca6cf89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-core \
python3.13dist-azure-mgmt-core \
python313-azure-mgmt-core \
python3dist-azure-mgmt-core"

RDEPENDS:${PN} += "-python313-azure-core >= 1.32.0 with python313-azure-core < 2.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg"

inherit rpm
