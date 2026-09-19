SUMMARY = "SSH public key parser"
DESCRIPTION = "OpenSSH Public Key Parser for Python"
LICENSE = "BSD-3-Clause"

PV = "3.3.1"

RPM_NAME = "python313-sshpubkeys-3.3.1-3.5.noarch.rpm"
RPM_HASH = "22719473d735087f637a591fdaf20bc872eb93ca9116af3092890ffe612670a3a631385145f5e9927deb6dfde4dcd78439c7d5ba9be44e695219fad686345a36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sshpubkeys \
python3.13dist-sshpubkeys \
python313-sshpubkeys \
python3dist-sshpubkeys"

RDEPENDS:${PN} += "python-abi \
python313-cryptography \
python313-ecdsa"

inherit rpm
