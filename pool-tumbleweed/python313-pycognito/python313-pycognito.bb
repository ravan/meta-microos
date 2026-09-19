SUMMARY = "Python class to integrate Boto3's Cognito client"
DESCRIPTION = "Python class to integrate Boto3's Cognito client so it is easy to login users. With SRP support."
LICENSE = "Apache-2.0"

PV = "2024.5.1"

RPM_NAME = "python313-pycognito-2024.5.1-1.9.noarch.rpm"
RPM_HASH = "2b6eeeb82bb76cda0dc64c4dcec3cbd313ece954a125ec55bb130a96368554078a00a9aeb2d7d20a5a79beb6e7e766bb8759a8f4dac2c7088b64b38e8f2e049b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pycognito \
python3.13dist-pycognito \
python313-pycognito \
python3dist-pycognito"

RDEPENDS:${PN} += "python-abi \
python313-PyJWT \
python313-boto3 \
python313-cryptography \
python313-envs \
python313-requests"

inherit rpm
