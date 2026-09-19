SUMMARY = "A runtime developer console and IRB alternative with powerful"
DESCRIPTION = "Pry is a runtime developer console and IRB alternative with powerful \
introspection capabilities. Pry aims to be more than an IRB replacement. It is \
an attempt to bring REPL driven programming to the Ruby language."
LICENSE = "MIT"

PV = "0.14.2"

RPM_NAME = "ruby4.0-rubygem-pry-0.14.2-1.16.aarch64.rpm"
RPM_HASH = "c6f265a4052acb0bc98663f395b79b3acffa75be0440a3be1eeb3ee39583bea172593c47bbd8f17e9702ea466c88e71c89a60fe3431a5770860f7945bca1396c"

RPROVIDES:${PN} += "ruby4.0-rubygem-pry \
rubygem-pry \
rubygem-ruby-4.0.0-pry \
rubygem-ruby-4.0.0-pry-0 \
rubygem-ruby-4.0.0-pry-0.14 \
rubygem-ruby-4.0.0-pry-0.14.2"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby4.0 \
alts \
ruby-abi \
rubygem-ruby-4.0.0-coderay-1 \
rubygem-ruby-4.0.0-method-source-1"

inherit rpm
