SUMMARY = "A toolkit for building modeling frameworks (part of Rails)"
DESCRIPTION = "A toolkit for building modeling frameworks like Active Record. Rich support \
for attributes, callbacks, validations, serialization, internationalization, \
and testing."
LICENSE = "MIT"

PV = "8.0.5"

RPM_NAME = "ruby4.0-rubygem-activemodel-8.0-8.0.5-1.2.aarch64.rpm"
RPM_HASH = "f065e8f6230511cc4a32d3b9c4da987620157adb19fb38bde3ed90ca74ce4f0d8fc5107a4e9d3f6966367b78ad22792bf5a1ff085a6e23a2d5f5b8479ba423dd"

RPROVIDES:${PN} += "ruby4.0-rubygem-activemodel-8.0 \
rubygem-activemodel \
rubygem-ruby-4.0.0-activemodel \
rubygem-ruby-4.0.0-activemodel-8 \
rubygem-ruby-4.0.0-activemodel-8.0 \
rubygem-ruby-4.0.0-activemodel-8.0.5"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-activesupport"

inherit rpm
