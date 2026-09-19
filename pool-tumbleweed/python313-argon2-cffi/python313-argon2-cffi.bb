SUMMARY = "The Argon2 password hashing algorithm for Python"
DESCRIPTION = "A Python module that uses CFFI to access the Argon2 password hashing \
C library."
LICENSE = "MIT"

PV = "25.1.0"

RPM_NAME = "python313-argon2-cffi-25.1.0-1.5.noarch.rpm"
RPM_HASH = "f470db6896805f2a50303061de9f5c0feed4a898fe21810f251d092848a276f2267b1c628047faf7cb89fc7bf819eea3c6d115bfe725d13dab8fb68c4ed741f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-argon2-cffi \
python3.13dist-argon2-cffi \
python313-argon2-cffi \
python3dist-argon2-cffi"

RDEPENDS:${PN} += "python-abi \
python313-argon2-cffi-bindings"

inherit rpm
