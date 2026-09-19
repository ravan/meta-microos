SUMMARY = "Your personal string matching expert"
DESCRIPTION = "A library implementing patterns that behave like regular expressions."
LICENSE = "MIT"

PV = "3.0.3"

RPM_NAME = "ruby4.0-rubygem-mustermann-3.0.3-1.10.aarch64.rpm"
RPM_HASH = "4b881033989f59f6b53fa0dbd0f5456438a1ed2ab8d276f45af93b4ef8bf7bf124c13a8cde87c8dd5032f30203b5fdc44253ea9a421281a7bf3a98bdd4a58726"

RPROVIDES:${PN} += "ruby4.0-rubygem-mustermann \
rubygem-mustermann \
rubygem-ruby-4.0.0-mustermann \
rubygem-ruby-4.0.0-mustermann-3 \
rubygem-ruby-4.0.0-mustermann-3.0 \
rubygem-ruby-4.0.0-mustermann-3.0.3"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-ruby2-keywords-0.0"

inherit rpm
