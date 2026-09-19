SUMMARY = "Optimist is a commandline option parser for Ruby that just gets out"
DESCRIPTION = "Optimist is a commandline option parser for Ruby that just \
gets out of your way. One line of code per option is all you need to write. \
For that, you get a nice automatically-generated help page, robust option \
parsing, command subcompletion, and sensible defaults for everything you don't \
specify."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "ruby4.0-rubygem-optimist-3.1.0-1.15.aarch64.rpm"
RPM_HASH = "3afcd09cd10aef4ee0fad9628530cc7e7b0dcc7f140335d0796a3f8f49b1192ccc312ae1e80511eb4ea10420ddcd4b5e2bc0ab0d374311536b676e899c29db48"

RPROVIDES:${PN} += "ruby4.0-rubygem-optimist \
rubygem-optimist \
rubygem-ruby-4.0.0-optimist \
rubygem-ruby-4.0.0-optimist-3 \
rubygem-ruby-4.0.0-optimist-3.1 \
rubygem-ruby-4.0.0-optimist-3.1.0"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
