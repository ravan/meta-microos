SUMMARY = "RuboCop tools to deal with Ruby code AST"
DESCRIPTION = "RuboCop's Node and NodePattern classes."
LICENSE = "MIT"

PV = "1.44.0"

RPM_NAME = "ruby4.0-rubygem-rubocop-ast-1.44.0-1.7.aarch64.rpm"
RPM_HASH = "5f806b4afcc29be3f43d0ea7d951b076378df4330a042e53b61b66bdad912ac324f2f7c6cbfb56ac41234882221baf473d7f63df9521948fc82dcd4c929bc283"

RPROVIDES:${PN} += "ruby4.0-rubygem-rubocop-ast \
rubygem-rubocop-ast \
rubygem-ruby-4.0.0-rubocop-ast \
rubygem-ruby-4.0.0-rubocop-ast-1 \
rubygem-ruby-4.0.0-rubocop-ast-1.44 \
rubygem-ruby-4.0.0-rubocop-ast-1.44.0"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-parser \
rubygem-ruby-4.0.0-prism-1"

inherit rpm
