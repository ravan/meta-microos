SUMMARY = "lightbox2 for Ruby on Rails"
DESCRIPTION = "This gem for Ruby on Rails provides the lightbox2 library to Rails's asset \
pipeline."
LICENSE = "MIT"

PV = "2.11.3"

RPM_NAME = "ruby4.0-rubygem-lightbox2-2.11.3-1.26.aarch64.rpm"
RPM_HASH = "03e44cc14a30d94b9fc41d3624d9692fd9fbc348b9aaf3b02adf125a44b648992eecff1862bfe3d13e8bf49dbb8baf5131a7ea8d236ee3f69e224bb05b8d8ed5"

RPROVIDES:${PN} += "ruby4.0-rubygem-lightbox2 \
rubygem-lightbox2 \
rubygem-ruby-4.0.0-lightbox2 \
rubygem-ruby-4.0.0-lightbox2-2 \
rubygem-ruby-4.0.0-lightbox2-2.11 \
rubygem-ruby-4.0.0-lightbox2-2.11.3"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-jquery-rails"

inherit rpm
