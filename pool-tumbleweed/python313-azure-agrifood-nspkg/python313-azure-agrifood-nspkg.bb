SUMMARY = "Microsoft Azure AgriFood Namespace Package"
DESCRIPTION = "This is the Microsoft Azure AgriFood namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.agrifood namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python313-azure-agrifood-nspkg-1.0.0-3.9.noarch.rpm"
RPM_HASH = "ff05cee03c29cd3179d889ab0a79774a853d594bcc0fb4021deacdd9dbe668014c1e6030722917140d686f899ad60037d13bf7cf7641eeaf26fef1ae7d83ab4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-agrifood-nspkg \
python3.13dist-azure-agrifood-nspkg \
python313-azure-agrifood-nspkg \
python3dist-azure-agrifood-nspkg"

RDEPENDS:${PN} += "python-abi \
python313-azure-nspkg"

inherit rpm
