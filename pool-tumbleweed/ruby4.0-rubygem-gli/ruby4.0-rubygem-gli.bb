SUMMARY = "Build command-suite CLI apps that are awesome"
DESCRIPTION = "Build command-suite CLI apps that are awesome.  Bootstrap your app, add \
commands, options and documentation while maintaining a well-tested idiomatic \
command-line app."
LICENSE = "Apache-2.0"

PV = "2.22.2"

RPM_NAME = "ruby4.0-rubygem-gli-2.22.2-1.8.aarch64.rpm"
RPM_HASH = "2885999d35ebb113c493332847c921c2c11e9bf489f38577f8a351d4226aaccbc01a5cff2e906e4d0ed18a203bf54503630bc16668710e8a8a77e857b2de7a95"

RPROVIDES:${PN} += "ruby4.0-rubygem-gli \
rubygem-gli \
rubygem-ruby-4.0.0-gli \
rubygem-ruby-4.0.0-gli-2 \
rubygem-ruby-4.0.0-gli-2.22 \
rubygem-ruby-4.0.0-gli-2.22.2"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/ruby.ruby4.0 \
alts \
ruby-abi \
rubygem-ruby-4.0.0-ostruct"

inherit rpm
