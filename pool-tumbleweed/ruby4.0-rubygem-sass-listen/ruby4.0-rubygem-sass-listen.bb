SUMMARY = "Fork of guard/listen"
DESCRIPTION = "This fork of guard/listen provides a stable API for users of the ruby Sass \
CLI."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "ruby4.0-rubygem-sass-listen-4.0.0-1.39.aarch64.rpm"
RPM_HASH = "fb79b32512d3a5410f6155c61421c7fdd45bacf8a437a378640175f492a58d82274f3bf7333e0a66dc915ee72d1fad63f0d66767d78aa48a23e490a1f0be962a"

RPROVIDES:${PN} += "ruby4.0-rubygem-sass-listen \
rubygem-ruby-4.0.0-sass-listen \
rubygem-ruby-4.0.0-sass-listen-4 \
rubygem-ruby-4.0.0-sass-listen-4.0 \
rubygem-ruby-4.0.0-sass-listen-4.0.0 \
rubygem-sass-listen"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-rb-fsevent \
rubygem-ruby-4.0.0-rb-fsevent-0 \
rubygem-ruby-4.0.0-rb-inotify \
rubygem-ruby-4.0.0-rb-inotify-0"

inherit rpm
