SUMMARY = "Microsoft Azure Communication Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Communication namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.communication namespace."
LICENSE = "MIT"

PV = "0.0.0b1"

RPM_NAME = "python314-azure-communication-nspkg-0.0.0b1-4.9.noarch.rpm"
RPM_HASH = "eab08d2ac2ca87c934018b5fdc2b35387673cbe377f0b4b7343328aa614f91d7f18c6393bc2af0c90f2f015f1c4eaa01102e62a5e9f105713eec60269a365b29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-communication-nspkg \
python314-azure-communication-nspkg \
python3dist-azure-communication-nspkg"

RDEPENDS:${PN} += "python-abi \
python314-azure-nspkg"

inherit rpm
