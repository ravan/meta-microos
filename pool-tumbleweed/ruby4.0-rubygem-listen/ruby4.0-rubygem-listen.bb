SUMMARY = "Listen to file modifications"
DESCRIPTION = "The Listen gem listens to file modifications and notifies you about the \
changes. Works everywhere!."
LICENSE = "MIT"

PV = "3.9.0"

RPM_NAME = "ruby4.0-rubygem-listen-3.9.0-1.12.aarch64.rpm"
RPM_HASH = "580ef9f894581363de81ae592a0739bb6fe39d1080ba72bad48f2ddeee7127f76eb15fc63f599b2cd23f515d74745c4c8fd096542d7d21b93c2f28b5f95f5496"

RPROVIDES:${PN} += "ruby4.0-rubygem-listen \
rubygem-listen \
rubygem-ruby-4.0.0-listen \
rubygem-ruby-4.0.0-listen-3 \
rubygem-ruby-4.0.0-listen-3.9 \
rubygem-ruby-4.0.0-listen-3.9.0"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby4.0 \
alts \
ruby-abi \
rubygem-ruby-4.0.0-rb-fsevent \
rubygem-ruby-4.0.0-rb-fsevent-0 \
rubygem-ruby-4.0.0-rb-inotify \
rubygem-ruby-4.0.0-rb-inotify-0"

inherit rpm
