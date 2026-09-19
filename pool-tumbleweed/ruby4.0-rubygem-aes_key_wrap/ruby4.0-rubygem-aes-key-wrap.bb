SUMMARY = "A Ruby implementation of AES Key Wrap, a.k.a RFC 3394, a.k.a NIST"
DESCRIPTION = "A Ruby implementation of AES Key Wrap, a.k.a RFC 3394, a.k.a NIST Key Wrap."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "ruby4.0-rubygem-aes_key_wrap-1.1.0-1.29.aarch64.rpm"
RPM_HASH = "50a1ae5995b3d999666fac47af2c303c4b4ef61e3486baa0b09d8ee2bef9ba69fe05e0b0516aa0e183bb63ee3cd495727a6838628f32ddc7e6137c0f3e99f1b9"

RPROVIDES:${PN} += "ruby4.0-rubygem-aes-key-wrap \
rubygem-aes-key-wrap \
rubygem-ruby-4.0.0-aes-key-wrap \
rubygem-ruby-4.0.0-aes-key-wrap-1 \
rubygem-ruby-4.0.0-aes-key-wrap-1.1 \
rubygem-ruby-4.0.0-aes-key-wrap-1.1.0"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/ruby.ruby4.0 \
ruby-abi"

inherit rpm
