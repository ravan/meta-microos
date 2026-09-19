SUMMARY = "Refer to any model with a URI: gid://app/class/id"
DESCRIPTION = "URIs for your models makes it easy to pass references around."
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "ruby4.0-rubygem-globalid-1.2.1-1.15.aarch64.rpm"
RPM_HASH = "50b32fb4099665e2db7552758fccccdb1e1555bba227f26189167466a56c8320041f5ee66a3400ed7dc032bd5e1df84674ec7deb9c213a4600016ac5f557be62"

RPROVIDES:${PN} += "ruby4.0-rubygem-globalid \
rubygem-globalid \
rubygem-ruby-4.0.0-globalid \
rubygem-ruby-4.0.0-globalid-1 \
rubygem-ruby-4.0.0-globalid-1.2 \
rubygem-ruby-4.0.0-globalid-1.2.1"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-activesupport"

inherit rpm
