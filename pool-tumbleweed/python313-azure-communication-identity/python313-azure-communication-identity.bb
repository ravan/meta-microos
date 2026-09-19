SUMMARY = "Microsoft Azure Communication Identity Service Client Library for Python"
DESCRIPTION = "Azure Communication Identity client package is intended to be used to setup the basics for opening a \
way to use Azure Communication Service offerings. This package helps to create identity user tokens \
to be used by other client packages such as chat, calling, sms."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "python313-azure-communication-identity-1.5.0-2.9.noarch.rpm"
RPM_HASH = "e9dc7b0db8f5de2855c2b255a31ca503671c6a81f9d661423813c96e77640ab855b7b3ec3becf8c6410d1a707e35bb84148893ece4ad5bff858fb49cdf63681d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-communication-identity \
python3.13dist-azure-communication-identity \
python313-azure-communication-identity \
python3dist-azure-communication-identity"

RDEPENDS:${PN} += "-python313-azure-core >= 1.24.0 with python313-azure-core < 2.0.0 \
python-abi \
python313-azure-communication-nspkg \
python313-azure-nspkg \
python313-msrest"

inherit rpm
