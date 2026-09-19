SUMMARY = "A(Sync) Interface for internal Audible API"
DESCRIPTION = "A(Sync) Interface for internal Audible API written in pure Python."
LICENSE = "AGPL-3.0-only"

PV = "0.12.0"

RPM_NAME = "python313-audible-0.12.0-1.1.noarch.rpm"
RPM_HASH = "9a1f1b8df12d176d8aac7a80ace352316b090933fbc3de706bf010a23648bcd4b81fe45f24c047bee3e848b8d03b46e397362bc3561a0d1ccd3806db69c0c84e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-audible \
python3.13dist-audible \
python313-audible \
python3dist-audible"

RDEPENDS:${PN} += "python-abi \
python313-Pillow \
python313-beautifulsoup4 \
python313-httpx \
python313-pbkdf2 \
python313-pyaes \
python313-rsa"

inherit rpm
