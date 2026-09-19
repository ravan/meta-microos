SUMMARY = "A library for working with Abstract Syntax Trees"
DESCRIPTION = "A library for working with Abstract Syntax Trees."
LICENSE = "MIT"

PV = "2.4.2"

RPM_NAME = "ruby4.0-rubygem-ast-2.4.2-1.26.aarch64.rpm"
RPM_HASH = "e71a9cc02f25e44ce42e23be34cc6955567969bd4667d870d90d3cace6f4df9c56e68495fd892295453f785b18b1c2852ff3ccc5c94a38bd670e02cfa451c1a6"

RPROVIDES:${PN} += "ruby4.0-rubygem-ast \
rubygem-ast \
rubygem-ruby-4.0.0-ast \
rubygem-ruby-4.0.0-ast-2 \
rubygem-ruby-4.0.0-ast-2.4 \
rubygem-ruby-4.0.0-ast-2.4.2"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
