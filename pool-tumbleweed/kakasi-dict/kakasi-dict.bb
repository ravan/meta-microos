SUMMARY = "The base dictionary of KAKASI"
DESCRIPTION = "The base dictionary of KAKASI"
LICENSE = "GPL-2.0-or-later"

PV = "2.3.6"

RPM_NAME = "kakasi-dict-2.3.6-9.6.aarch64.rpm"
RPM_HASH = "75cfb57d1d54856b5da0a5f64792f5c1d06f0dbdff1bc8731c8f2d11d3b34711d68e6e9015944a595962b95bc408a42fe158046059bbf51b5bf7b170a2cb6225"

RPROVIDES:${PN} += "kakasi-dict \
kakasidi"

RDEPENDS:${PN} += ""

inherit rpm
