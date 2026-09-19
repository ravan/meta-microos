SUMMARY = "Perl bindings for OpenWSMAN client API"
DESCRIPTION = "This package provides Perl bindings to access the OpenWSMAN client API."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "2.8.1"

RPM_NAME = "openwsman-perl-2.8.1-5.1.aarch64.rpm"
RPM_HASH = "a1d3e2f08b3e77fcd5bb8563ee0a09c675e801b3159865924dd1a37f717c86f310d31edb1afde54784c2e0d848bfb18d21ff1b0ecd41bbbd36b53675cb7b1f67"

RPROVIDES:${PN} += "openwsman-perl \
perl-openwsman \
perl-openwsman--Client \
perl-openwsman--ClientOptions \
perl-openwsman--Context \
perl-openwsman--EndPointReference \
perl-openwsman--EnumerateInfo \
perl-openwsman--Fault \
perl-openwsman--Filter \
perl-openwsman--Soap \
perl-openwsman--SoapOp \
perl-openwsman--Status \
perl-openwsman--Transport \
perl-openwsman--XmlAttr \
perl-openwsman--XmlDoc \
perl-openwsman--XmlNode \
perl-openwsman--XmlNs \
perl-openwsmanc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libwsman-client.so.5 \
libwsman-curl-client-transport.so.1 \
libwsman.so.1 \
perl"

inherit rpm
