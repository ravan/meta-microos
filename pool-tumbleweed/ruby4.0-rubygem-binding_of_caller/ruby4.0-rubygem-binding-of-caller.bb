SUMMARY = "Retrieve the binding of a method's caller, or further up the stack"
DESCRIPTION = "Provides the Binding#of_caller method. \
Using binding_of_caller we can grab bindings from higher up the call stack and \
evaluate code in that context. \
Allows access to bindings arbitrarily far up the call stack, not limited to \
just the immediate caller. \
Recommended for use only in debugging situations. Do not use this in \
production apps."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "ruby4.0-rubygem-binding_of_caller-1.0.1-1.11.aarch64.rpm"
RPM_HASH = "7e05a3a77da6ce9fb3714fabae98577dd29481275ed4622f29f69ee77d975b9554ff40fbe73630aa910957ca9874ef7677457e7ff2dce0c204472f4e2ff27be3"

RPROVIDES:${PN} += "ruby4.0-rubygem-binding-of-caller \
rubygem-binding-of-caller \
rubygem-ruby-4.0.0-binding-of-caller \
rubygem-ruby-4.0.0-binding-of-caller-1 \
rubygem-ruby-4.0.0-binding-of-caller-1.0 \
rubygem-ruby-4.0.0-binding-of-caller-1.0.1"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-debug-inspector"

inherit rpm
