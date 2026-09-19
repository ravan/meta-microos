SUMMARY = "Microsoft Azure Communication Administration Service Client Library for Python"
DESCRIPTION = "Azure Communication Administration client package is intended to be used to setup the basics for opening a way to use \
Azure Communication Service offerings. This package helps to create identities user tokens to be used by other client \
packages such as chat, calling, sms."
LICENSE = "MIT"

PV = "1.0.0b4"

RPM_NAME = "python314-azure-communication-administration-1.0.0b4-3.9.noarch.rpm"
RPM_HASH = "64e9fd5c47f9281d700f3fac62deca9f91427719b26b10bf3764faac21a51446a3e378211294ad67205fe5a777e80c65049655ae9770e46ed2505778093fe57f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-communication-administration \
python314-azure-communication-administration \
python3dist-azure-communication-administration"

RDEPENDS:${PN} += "-python314-azure-core >= 1.6.0 with python314-azure-core < 2.0.0 \
python-abi \
python314-azure-communication-nspkg \
python314-azure-nspkg \
python314-msrest"

inherit rpm
