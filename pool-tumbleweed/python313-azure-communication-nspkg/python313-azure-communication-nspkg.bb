SUMMARY = "Microsoft Azure Communication Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Communication namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.communication namespace."
LICENSE = "MIT"

PV = "0.0.0b1"

RPM_NAME = "python313-azure-communication-nspkg-0.0.0b1-4.9.noarch.rpm"
RPM_HASH = "f8eceb51465370270315f4c679349d6fc5981e82e3ea7388e8ab6e1b7304657e260f2c02a460d7d5cb8f70f0a4d7bc676ae8068acd4aed806089ddce53d7c301"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-communication-nspkg \
python3.13dist-azure-communication-nspkg \
python313-azure-communication-nspkg \
python3dist-azure-communication-nspkg"

RDEPENDS:${PN} += "python-abi \
python313-azure-nspkg"

inherit rpm
