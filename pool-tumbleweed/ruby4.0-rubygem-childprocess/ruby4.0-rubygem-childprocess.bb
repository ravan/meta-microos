SUMMARY = "A simple and reliable solution for controlling external programs"
DESCRIPTION = "This gem aims at being a simple and reliable solution for controlling external \
programs running in the background on any Ruby / OS combination."
LICENSE = "MIT"

PV = "5.1.0"

RPM_NAME = "ruby4.0-rubygem-childprocess-5.1.0-1.10.aarch64.rpm"
RPM_HASH = "f8febc67df95872e045679d7ed349fa689848a39ea0548e0f4c731d2bc0b997f22b0d5e18c4d5cfbe6528767842f1227a3e6cb5e4d143e47eb5528a7a49914ca"

RPROVIDES:${PN} += "ruby4.0-rubygem-childprocess \
rubygem-childprocess \
rubygem-ruby-4.0.0-childprocess \
rubygem-ruby-4.0.0-childprocess-5 \
rubygem-ruby-4.0.0-childprocess-5.1 \
rubygem-ruby-4.0.0-childprocess-5.1.0"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-logger-1"

inherit rpm
