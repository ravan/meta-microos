SUMMARY = "A minimal mime type library"
DESCRIPTION = "A minimal mime type library."
LICENSE = "MIT"

PV = "1.1.5"

RPM_NAME = "ruby4.0-rubygem-mini_mime-1.1.5-1.15.aarch64.rpm"
RPM_HASH = "f732baf41f7ce3eae33bfe16aa5d351c4b1fe7c8fad8173ff9284bf8563df5d5e0b8421564225b9570035d0d2f30878ea55c063becdc0c2a6ed9c99f7a19cb66"

RPROVIDES:${PN} += "ruby4.0-rubygem-mini-mime \
rubygem-mini-mime \
rubygem-ruby-4.0.0-mini-mime \
rubygem-ruby-4.0.0-mini-mime-1 \
rubygem-ruby-4.0.0-mini-mime-1.1 \
rubygem-ruby-4.0.0-mini-mime-1.1.5"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/ruby.ruby4.0 \
ruby-abi"

inherit rpm
