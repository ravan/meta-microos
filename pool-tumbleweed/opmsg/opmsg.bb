SUMMARY = "File encryption, sign and verify utility"
DESCRIPTION = "opmsg is a replacement for gpg which can encrypt/sign/verify your mails or \
create/verify detached signatures of local files. Even though the opmsg \
output looks similar, the concept is entirely different. \
 \
* Perfect Forward Secrecy (PFS) by means of ECDH or DH Kex. \
* Native EC or RSA fallback if no (EC)DH keys left. \
* Signing messages is mandatory. \
* OTR-like deniable signatures if demanded. \
* Support for 1:1 key bindings to auto-select source key per \
  destination. \
* Adds the possibility to (re-)route messages different from mail \
  address to defeat meta data collection. \
* Key format suitable for easy use with QR codes. \
* Optional cross-domain ECDH Kex."
LICENSE = "GPL-3.0-or-later"

PV = "1.78s"

RPM_NAME = "opmsg-1.78s-1.22.aarch64.rpm"
RPM_HASH = "59404ab997925cf646f99dff18b44fd19e84b86149afb47fd9abb4f205ccf609fc615520920d828f9ea2d0a7f28391402392345ab416a6858789dbe89b710598"

RPROVIDES:${PN} += "opmsg"

RDEPENDS:${PN} += "libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
