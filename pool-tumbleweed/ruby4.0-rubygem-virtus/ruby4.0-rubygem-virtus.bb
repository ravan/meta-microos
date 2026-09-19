SUMMARY = "Attributes on Steroids for Plain Old Ruby Objects"
DESCRIPTION = "Attributes on Steroids for Plain Old Ruby Objects."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "ruby4.0-rubygem-virtus-2.0.0-1.25.aarch64.rpm"
RPM_HASH = "362f837dea162c4b4044d7806d4d2958d9662a735fdf49f93af0e72929ba72243522fa0349dcba3e8c1eee3d3178e1e72849443e10663ffa87331d2786971658"

RPROVIDES:${PN} += "ruby4.0-rubygem-virtus \
rubygem-ruby-4.0.0-virtus \
rubygem-ruby-4.0.0-virtus-2 \
rubygem-ruby-4.0.0-virtus-2.0 \
rubygem-ruby-4.0.0-virtus-2.0.0 \
rubygem-virtus"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-axiom-types-0 \
rubygem-ruby-4.0.0-coercible-1 \
rubygem-ruby-4.0.0-descendants-tracker \
rubygem-ruby-4.0.0-descendants-tracker-0"

inherit rpm
