SUMMARY = "Library for validating urls in Rails"
DESCRIPTION = "Library for validating urls in Rails."
LICENSE = "MIT"

PV = "1.0.15"

RPM_NAME = "ruby4.0-rubygem-validate_url-1.0.15-1.19.aarch64.rpm"
RPM_HASH = "cc9a9804d8968ace830be5c8999a93beb742c72f59731f9e23b6b51b1525628fb581b914871ef522f0bc485819cba68d578108a3e671c3f10bc12b01f0f40b47"

RPROVIDES:${PN} += "ruby4.0-rubygem-validate-url \
rubygem-ruby-4.0.0-validate-url \
rubygem-ruby-4.0.0-validate-url-1 \
rubygem-ruby-4.0.0-validate-url-1.0 \
rubygem-ruby-4.0.0-validate-url-1.0.15 \
rubygem-validate-url"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-activemodel \
rubygem-ruby-4.0.0-public-suffix"

inherit rpm
