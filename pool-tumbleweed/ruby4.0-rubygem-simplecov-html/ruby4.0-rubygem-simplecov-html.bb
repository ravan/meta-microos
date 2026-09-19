SUMMARY = "Default HTML formatter for SimpleCov code coverage tool for ruby 2.4+"
DESCRIPTION = "Default HTML formatter for SimpleCov code coverage tool for ruby 2.4+."
LICENSE = "MIT"

PV = "0.13.1"

RPM_NAME = "ruby4.0-rubygem-simplecov-html-0.13.1-1.10.aarch64.rpm"
RPM_HASH = "8bd00d1010403d0473995a4b95dadc31bce171f79bf577907b7e6bd688f7f37232f76842638dd6aedc50d14f770dd07a162d6279583163bc728097bcf261d394"

RPROVIDES:${PN} += "ruby4.0-rubygem-simplecov-html \
rubygem-ruby-4.0.0-simplecov-html \
rubygem-ruby-4.0.0-simplecov-html-0 \
rubygem-ruby-4.0.0-simplecov-html-0.13 \
rubygem-ruby-4.0.0-simplecov-html-0.13.1 \
rubygem-simplecov-html"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
