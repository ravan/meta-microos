SUMMARY = "Ruby bindings for rpm (package manager)"
DESCRIPTION = "Ruby bindings for rpm. Almost a drop-in replacement for ruby-rpm. Uses FFI."
LICENSE = "MIT"

PV = "0.0.5"

RPM_NAME = "ruby4.0-rubygem-rpm-0.0.5-1.41.aarch64.rpm"
RPM_HASH = "c1329def2735c31dc728d3c693d085593bea3b0edb5ff593bbe9971f7f6563b74b499848d4832ba9bfd2a220d4cab136e4629b444190b4235c75e6b95830802f"

RPROVIDES:${PN} += "ruby4.0-rubygem-rpm \
rubygem-rpm \
rubygem-ruby-4.0.0-rpm \
rubygem-ruby-4.0.0-rpm-0 \
rubygem-ruby-4.0.0-rpm-0.0 \
rubygem-ruby-4.0.0-rpm-0.0.5"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-ffi"

inherit rpm
