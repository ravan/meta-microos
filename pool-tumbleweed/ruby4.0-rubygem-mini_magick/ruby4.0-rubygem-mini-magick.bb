SUMMARY = "Manipulate images with minimal use of memory via ImageMagick"
DESCRIPTION = "Manipulate images with minimal use of memory via ImageMagick."
LICENSE = "MIT"

PV = "5.3.1"

RPM_NAME = "ruby4.0-rubygem-mini_magick-5.3.1-1.1.aarch64.rpm"
RPM_HASH = "dddee9453ab7c42a869ebf46a2acdd3649b1e6bdf743e5fd3d682999caec7b6cea8068632545a5a3b3eb201a8e4d3d32bd8e36222227dc6127bc80414327bec4"

RPROVIDES:${PN} += "ruby4.0-rubygem-mini-magick \
rubygem-mini-magick \
rubygem-ruby-4.0.0-mini-magick \
rubygem-ruby-4.0.0-mini-magick-5 \
rubygem-ruby-4.0.0-mini-magick-5.3 \
rubygem-ruby-4.0.0-mini-magick-5.3.1"

RDEPENDS:${PN} += "ImageMagick \
ruby-abi \
rubygem-ruby-4.0.0-logger"

inherit rpm
