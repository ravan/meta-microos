SUMMARY = "A plugin specification for linter and formatter rulesets"
DESCRIPTION = "lint_roller is an small plugin API for code analysis tools like linters and formatters. \
It provides plugins for those tools to load extensions and specify custom rulesets."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "ruby4.0-rubygem-lint_roller-1.1.0-1.7.aarch64.rpm"
RPM_HASH = "9c374174658939eb4d8be414d0d653f1ba5fbd23b142146c46aa5d92d971dbc1dfa9b17b65258fa640f912c5db230185d49aa06a130413a6c688b7a90898513d"

RPROVIDES:${PN} += "ruby4.0-rubygem-lint-roller \
rubygem-lint-roller \
rubygem-ruby-4.0.0-lint-roller \
rubygem-ruby-4.0.0-lint-roller-1 \
rubygem-ruby-4.0.0-lint-roller-1.1 \
rubygem-ruby-4.0.0-lint-roller-1.1.0"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
