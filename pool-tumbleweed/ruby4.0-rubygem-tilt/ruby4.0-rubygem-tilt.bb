SUMMARY = "Generic interface to multiple Ruby template engines"
DESCRIPTION = "Generic interface to multiple Ruby template engines."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "ruby4.0-rubygem-tilt-2.4.0-1.11.aarch64.rpm"
RPM_HASH = "325282dbda758ebdf4aeaf68eac34ba3dd913c6baee72600e2b0f9a32538f4b7f80fc521b050cb12f02eac91dab142ba49427b86178ac9af083c5c3a9709685e"

RPROVIDES:${PN} += "ruby4.0-rubygem-tilt \
rubygem-ruby-4.0.0-tilt \
rubygem-ruby-4.0.0-tilt-2 \
rubygem-ruby-4.0.0-tilt-2.4 \
rubygem-ruby-4.0.0-tilt-2.4.0 \
rubygem-tilt"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby4.0 \
alts \
ruby-abi"

inherit rpm
