SUMMARY = "Forwardable with hash, and instance variable extensions"
DESCRIPTION = "Forwardable with hash, and instance variable extensions."
LICENSE = "MIT"

PV = "2.6.0"

RPM_NAME = "ruby4.0-rubygem-forwardable-extended-2.6.0-1.39.aarch64.rpm"
RPM_HASH = "1770aaf0750c08e79bdb9220076fd742de0a3567aa80a87b4613f1de8db197ea8e82b7427ce2da693fadcdf4e848738c57dde987dec5105d43e556c3dd09ae19"

RPROVIDES:${PN} += "ruby4.0-rubygem-forwardable-extended \
rubygem-forwardable-extended \
rubygem-ruby-4.0.0-forwardable-extended \
rubygem-ruby-4.0.0-forwardable-extended-2 \
rubygem-ruby-4.0.0-forwardable-extended-2.6 \
rubygem-ruby-4.0.0-forwardable-extended-2.6.0"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
