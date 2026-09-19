SUMMARY = "Ascii85 encoder/decoder"
DESCRIPTION = "Ascii85 provides methods to encode/decode Adobe's binary-to-text encoding of \
the same name."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "ruby4.0-rubygem-Ascii85-2.0.1-1.12.aarch64.rpm"
RPM_HASH = "82934eb01f1ec675f8ba6c3774835a2e349d00b78da5a6af97616d302a50282f8958158c715b31a6502eb6d7afaddc420c5ae9791f1af8bd1d565a2fa798d288"

RPROVIDES:${PN} += "ruby4.0-rubygem-Ascii85 \
rubygem-Ascii85 \
rubygem-ruby-4.0.0-Ascii85 \
rubygem-ruby-4.0.0-Ascii85-2 \
rubygem-ruby-4.0.0-Ascii85-2.0 \
rubygem-ruby-4.0.0-Ascii85-2.0.1"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby4.0 \
alts \
ruby-abi"

inherit rpm
