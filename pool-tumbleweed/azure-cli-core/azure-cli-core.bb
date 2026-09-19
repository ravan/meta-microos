SUMMARY = "Microsoft Azure CLI Core Module"
DESCRIPTION = "Microsoft Azure CLI Core Module"
LICENSE = "MIT"

PV = "2.90.0"

RPM_NAME = "azure-cli-core-2.90.0-1.1.noarch.rpm"
RPM_HASH = "4aafc15b354b787ca0fc5b14eafee4f1290e2822dc4c5fcd5858e560b267c450a43f58f610819ea8ed2b794a4cd83beb8f1cdeaed29414a3ac35cbfce0451908"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "azure-cli-core \
python3.13dist-azure-cli-core \
python3dist-azure-cli-core"

RDEPENDS:${PN} += "azure-cli-telemetry \
python-abi \
python313-PyJWT \
python313-argcomplete \
python313-azure-core \
python313-azure-mgmt-core \
python313-azure-nspkg \
python313-cryptography \
python313-humanfriendly \
python313-jmespath \
python313-knack \
python313-microsoft-security-utilities-secret-masker \
python313-msal \
python313-msal-extensions \
python313-packaging \
python313-pip \
python313-pkginfo \
python313-psutil \
python313-py-deviceid \
python313-pyOpenSSL \
python313-requests \
python313-wheel"

inherit rpm
