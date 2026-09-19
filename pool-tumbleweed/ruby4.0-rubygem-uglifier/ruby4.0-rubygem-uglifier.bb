SUMMARY = "Ruby wrapper for UglifyJS JavaScript compressor"
DESCRIPTION = "Uglifier minifies JavaScript files by wrapping UglifyJS to be accessible in \
Ruby."
LICENSE = "BSD-3-Clause & MIT"

PV = "4.2.1"

RPM_NAME = "ruby4.0-rubygem-uglifier-4.2.1-1.10.aarch64.rpm"
RPM_HASH = "a8e992e3e25b83be741a235cff36928790ae54f75ba7b146862fdfe12fc82626dd1e27e7a5dd66b89bd5b0d855346c012a7e9c2554f689195ae2d26cb1b804f0"

RPROVIDES:${PN} += "ruby4.0-rubygem-uglifier \
rubygem-ruby-4.0.0-uglifier \
rubygem-ruby-4.0.0-uglifier-4 \
rubygem-ruby-4.0.0-uglifier-4.2 \
rubygem-ruby-4.0.0-uglifier-4.2.1 \
rubygem-uglifier"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-execjs"

inherit rpm
