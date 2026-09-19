SUMMARY = "Common protocol buffer types used in Google APIs"
DESCRIPTION = "Common protocol buffer types used by Google APIs."
LICENSE = "Apache-2.0"

PV = "1.16.0"

RPM_NAME = "ruby4.0-rubygem-googleapis-common-protos-types-1.16.0-1.10.aarch64.rpm"
RPM_HASH = "a31f0508a3f4766c31b083a9add734e48f22b0b7e7f981037b793523d1ca3cd7ec9643605da2e217e693d2e49a1647392bf22d82f49c934ca78df93c47acca8e"

RPROVIDES:${PN} += "ruby4.0-rubygem-googleapis-common-protos-types \
rubygem-googleapis-common-protos-types \
rubygem-ruby-4.0.0-googleapis-common-protos-types \
rubygem-ruby-4.0.0-googleapis-common-protos-types-1 \
rubygem-ruby-4.0.0-googleapis-common-protos-types-1.16 \
rubygem-ruby-4.0.0-googleapis-common-protos-types-1.16.0"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-google-protobuf"

inherit rpm
