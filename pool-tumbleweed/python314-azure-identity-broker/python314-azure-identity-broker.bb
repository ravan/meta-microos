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

RPM_NAME = "python314-azure-identity-broker-1.3.0-1.5.noarch.rpm"
RPM_HASH = "ef8485eff7ec8eddf027c655ff861673ae3708b35440662b11efa36daa80bb0eabeb98a6f9db2235823456c28a39269f4f07eab78036fb13162aa8004ca627aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-identity-broker \
python314-azure-identity-broker \
python3dist-azure-identity-broker"

RDEPENDS:${PN} += "-python314-azure-identity >= 1.18.0 with python314-azure-identity < 2.0.0 \
-python314-msal >= 1.33.0 with python314-msal < 2.0.0 \
python-abi \
python314-azure-nspkg"

inherit rpm
