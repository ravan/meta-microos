SUMMARY = "IRC to other Chat Networks Gateway (User Guide)"
DESCRIPTION = "BitlBee is a gateway between instant messaging and an IRC client. \
With it, one's IRC client program can be reused and no extra IM program \
will need to run. \
 \
This package contains the user guide: \
  /usr/share/doc/packages/bitlbee/user-guide"
LICENSE = "GPL-2.0-only"

PV = "3.6"

RPM_NAME = "bitlbee-doc-3.6-5.11.aarch64.rpm"
RPM_HASH = "45ee5541c14497bda95375c2fb2f307a0095b525fd9c881ad05edc9ff8ae3a5a8dbfdf45d26f0a0067537890f49c0a8e3d312d228a948a2611c2e5155e4f27fd"

RPROVIDES:${PN} += "bitlbee-doc"

RDEPENDS:${PN} += "bitlbee"

inherit rpm
