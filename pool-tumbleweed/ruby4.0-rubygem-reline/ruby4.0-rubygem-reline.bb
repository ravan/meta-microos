SUMMARY = "Alternative GNU Readline or Editline implementation by pure Ruby"
DESCRIPTION = "Alternative GNU Readline or Editline implementation by pure Ruby."
LICENSE = "Ruby"

PV = "0.6.0"

RPM_NAME = "ruby4.0-rubygem-reline-0.6.0-1.8.aarch64.rpm"
RPM_HASH = "ece7ce181ba98a6b783d51f754d5b77d234c039eb6598ac8baad75508a7a2d465be941dcc3f5ea60ddb76940fa52643600958280583d81fb79e5ac2010e59442"

RPROVIDES:${PN} += "ruby4.0-rubygem-reline \
rubygem-reline \
rubygem-ruby-4.0.0-reline \
rubygem-ruby-4.0.0-reline-0 \
rubygem-ruby-4.0.0-reline-0.6 \
rubygem-ruby-4.0.0-reline-0.6.0"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-io-console-0"

inherit rpm
