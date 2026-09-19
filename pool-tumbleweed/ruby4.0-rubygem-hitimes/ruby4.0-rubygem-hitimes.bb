SUMMARY = "A fast, high resolution timer library for recording peformance"
DESCRIPTION = "A fast, high resolution timer library for recording peformance metrics. * \
(http://github.com/copiousfreetime/hitimes) * \
(http://github.com/copiousfreetime/hitimes) * email jeremy at copiousfreetime \
dot org * `git clone url git://github.com/copiousfreetime/hitimes.git`."
LICENSE = "ISC"

PV = "2.0.0"

RPM_NAME = "ruby4.0-rubygem-hitimes-2.0.0-1.31.aarch64.rpm"
RPM_HASH = "7b3b304ab60df1e4d2cdb9667af3dc4ce41548cfbe9235188ea69b16e6627f5ae96615f1039c86e332e65dc51afd60751d89e9c114793747c309dec8b2804576"

RPROVIDES:${PN} += "ruby4.0-rubygem-hitimes \
rubygem-hitimes \
rubygem-ruby-4.0.0-hitimes \
rubygem-ruby-4.0.0-hitimes-2 \
rubygem-ruby-4.0.0-hitimes-2.0 \
rubygem-ruby-4.0.0-hitimes-2.0.0"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
