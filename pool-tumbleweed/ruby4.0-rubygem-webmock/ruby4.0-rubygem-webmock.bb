SUMMARY = "Library for stubbing HTTP requests in Ruby"
DESCRIPTION = "WebMock allows stubbing HTTP requests and setting expectations on HTTP \
requests."
LICENSE = "MIT"

PV = "3.24.0"

RPM_NAME = "ruby4.0-rubygem-webmock-3.24.0-1.10.aarch64.rpm"
RPM_HASH = "d521397e5793def803e83a2c8c7774b133c9dea5d9b3ac4ba002dbba66432082c9e4ae50df93a4dad2522e9aea7cce6bf542b59edfcbcb38af7db78ba17590e2"

RPROVIDES:${PN} += "ruby4.0-rubygem-webmock \
rubygem-ruby-4.0.0-webmock \
rubygem-ruby-4.0.0-webmock-3 \
rubygem-ruby-4.0.0-webmock-3.24 \
rubygem-ruby-4.0.0-webmock-3.24.0 \
rubygem-webmock"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-addressable \
rubygem-ruby-4.0.0-crack \
rubygem-ruby-4.0.0-hashdiff"

inherit rpm
