SUMMARY = "Code coverage for Ruby"
DESCRIPTION = "Code coverage for Ruby with a powerful configuration library and automatic \
merging of coverage across test suites."
LICENSE = "MIT"

PV = "0.22.0"

RPM_NAME = "ruby4.0-rubygem-simplecov-0.22.0-1.15.aarch64.rpm"
RPM_HASH = "5d77f1e37958536362f1113aca482cb93160af70de948d1c62a2fb51d78b947a6f1455213e4313ad3800a463d1428243b76bd6fcd977b84a593e579be23acb96"

RPROVIDES:${PN} += "ruby4.0-rubygem-simplecov \
rubygem-ruby-4.0.0-simplecov \
rubygem-ruby-4.0.0-simplecov-0 \
rubygem-ruby-4.0.0-simplecov-0.22 \
rubygem-ruby-4.0.0-simplecov-0.22.0 \
rubygem-simplecov"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-docile-1 \
rubygem-ruby-4.0.0-simplecov-html-0 \
rubygem-ruby-4.0.0-simplecov-json-formatter-0"

inherit rpm
