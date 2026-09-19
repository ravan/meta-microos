SUMMARY = "Microsoft Azure Identity Broker plugin for Python"
DESCRIPTION = "This package extends the Azure Identity library by providing supplemental \
credentials for authenticating via an authentication broker. \
 \
An authentication broker is an application that runs on a user’s machine that \
manages the authentication handshakes and token maintenance for connected \
accounts. Currently, only the Windows authentication broker, Web Account \
Manager (WAM), is supported."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python313-azure-identity-broker-1.3.0-1.5.noarch.rpm"
RPM_HASH = "39c9b59184efd99790d7c27de1488cc901def87ae0e6bbe6b68b4fea526b01480d2446ad4701ba9fb0cf4ac21f451a77bc5c34f246e4f9434290170969e5d192"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-identity-broker \
python3.13dist-azure-identity-broker \
python313-azure-identity-broker \
python3dist-azure-identity-broker"

RDEPENDS:${PN} += "-python313-azure-identity >= 1.18.0 with python313-azure-identity < 2.0.0 \
-python313-msal >= 1.33.0 with python313-msal < 2.0.0 \
python-abi \
python313-azure-nspkg"

inherit rpm
