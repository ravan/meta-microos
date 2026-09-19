SUMMARY = "Python SPNEGO authentication library"
DESCRIPTION = "Library to handle SPNEGO (Negotiate, NTLM, Kerberos) authentication. \
Also includes a packet parser that can be used to decode raw \
NTLM/SPNEGO/Kerberos tokens into a human readable format."
LICENSE = "MIT"

PV = "0.12.2"

RPM_NAME = "python313-pyspnego-0.12.2-1.1.noarch.rpm"
RPM_HASH = "3b8175d9334c6791c1594d8be5b1a5e15ff4fa537fb9baa7faf920609e8b0bd84b1555440c0cebacbd58deade9abf3095558368e834366b602b2ac90a64b483b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyspnego \
python3.13dist-pyspnego \
python313-pyspnego \
python3dist-pyspnego"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-cryptography"

inherit rpm
