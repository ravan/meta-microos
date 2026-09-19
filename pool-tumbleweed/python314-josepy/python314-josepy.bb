SUMMARY = "JOSE protocol implementation in Python"
DESCRIPTION = "JOSE protocol implementation in Python using cryptography. \
It is used by the certbot project. Formerly Let's Encrypt project."
LICENSE = "Apache-2.0"

PV = "2.2.0"

RPM_NAME = "python314-josepy-2.2.0-1.4.noarch.rpm"
RPM_HASH = "d338c302e55c1257a95fdd8538eddf1452338d456f0f03532556531062b310037b4e57bc1fa7c7dd234368a0cf2644efa1418d65a3fc406a7ab6bcdd5e2594e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-josepy \
python314-josepy \
python3dist-josepy"

RDEPENDS:${PN} += "python-abi \
python314-cryptography"

inherit rpm
