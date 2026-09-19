SUMMARY = "Microsoft Azure Communication Administration Service Client Library for Python"
DESCRIPTION = "Azure Communication Administration client package is intended to be used to setup the basics for opening a way to use \
Azure Communication Service offerings. This package helps to create identities user tokens to be used by other client \
packages such as chat, calling, sms."
LICENSE = "MIT"

PV = "1.0.0b4"

RPM_NAME = "python313-azure-communication-administration-1.0.0b4-3.9.noarch.rpm"
RPM_HASH = "a5b22e52e5c0d42b318232954dc62116d2db041723a4e749b2063c5b0d3908fd3f9689b1a2bda33953568b5a2344df11649a945506763fe5683f6b6b3147f890"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-communication-administration \
python3.13dist-azure-communication-administration \
python313-azure-communication-administration \
python3dist-azure-communication-administration"

RDEPENDS:${PN} += "-python313-azure-core >= 1.6.0 with python313-azure-core < 2.0.0 \
python-abi \
python313-azure-communication-nspkg \
python313-azure-nspkg \
python313-msrest"

inherit rpm
