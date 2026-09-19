SUMMARY = "Let's Encrypt/ACME client and library written in Go"
DESCRIPTION = "Let's Encrypt/ACME client and library written in Go."
LICENSE = "MIT"

PV = "5.4.0"

RPM_NAME = "lego-5.4.0-1.1.aarch64.rpm"
RPM_HASH = "15c79d4911100015c48385dd66703a9cfb8c122586cb19ab32f47ae790838496fe032c2e04603990e49d7ed0af3903bc49083921fd567ac1fd4cff434a2635e9"

RPROVIDES:${PN} += "lego"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
