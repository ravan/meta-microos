SUMMARY = "Python class to integrate Boto3's Cognito client"
DESCRIPTION = "Python class to integrate Boto3's Cognito client so it is easy to login users. With SRP support."
LICENSE = "Apache-2.0"

PV = "2024.5.1"

RPM_NAME = "python314-pycognito-2024.5.1-1.9.noarch.rpm"
RPM_HASH = "680107f8459ac3dffe0616666a25d3c766c6c40d4f2e84841d28488f1cfbb66de60ee35ffb93bce549008edec90526ef02ac44abb4de2a108c449d7ff48acbd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pycognito \
python314-pycognito \
python3dist-pycognito"

RDEPENDS:${PN} += "python-abi \
python314-PyJWT \
python314-boto3 \
python314-cryptography \
python314-envs \
python314-requests"

inherit rpm
