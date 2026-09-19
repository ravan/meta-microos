SUMMARY = "SSH public key parser"
DESCRIPTION = "OpenSSH Public Key Parser for Python"
LICENSE = "BSD-3-Clause"

PV = "3.3.1"

RPM_NAME = "python314-sshpubkeys-3.3.1-3.5.noarch.rpm"
RPM_HASH = "cf29561644dfe33d96150984dfd650a394bba1659808c4889fcbee052ec5df76d1ba961cb1091489ab23b9873a02687d1e870bc83e3f7543259209245835c779"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sshpubkeys \
python314-sshpubkeys \
python3dist-sshpubkeys"

RDEPENDS:${PN} += "python-abi \
python314-cryptography \
python314-ecdsa"

inherit rpm
