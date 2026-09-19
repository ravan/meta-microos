SUMMARY = "Translates Ruby Hashes to XML"
DESCRIPTION = "Gyoku translates Ruby Hashes to XML."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "ruby4.0-rubygem-gyoku-1.4.0-1.22.aarch64.rpm"
RPM_HASH = "8f5f083df09f63ad9c22147d8a1cc7ebef01a87cbb24271475e744188a0672bf0640b05c9ee2817d7c443c336fb30e2d9b4db5b18fab7490834047e73512c182"

RPROVIDES:${PN} += "ruby4.0-rubygem-gyoku \
rubygem-gyoku \
rubygem-ruby-4.0.0-gyoku \
rubygem-ruby-4.0.0-gyoku-1 \
rubygem-ruby-4.0.0-gyoku-1.4 \
rubygem-ruby-4.0.0-gyoku-1.4.0"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-builder \
rubygem-ruby-4.0.0-rexml-3"

inherit rpm
