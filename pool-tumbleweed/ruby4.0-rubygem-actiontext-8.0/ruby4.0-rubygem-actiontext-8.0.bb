SUMMARY = "Rich text framework"
DESCRIPTION = "Edit and display rich text in Rails applications."
LICENSE = "MIT"

PV = "8.0.5"

RPM_NAME = "ruby4.0-rubygem-actiontext-8.0-8.0.5-1.2.aarch64.rpm"
RPM_HASH = "d0606b3d3d7b4bc175b9d36e573d0c5513bffb7a59e6cd367a3697d6249dd8df844a5097fd55b3facdee23f373f2f650ab869f04d8d86dca6e68d5eac702cf58"

RPROVIDES:${PN} += "ruby4.0-rubygem-actiontext-8.0 \
rubygem-actiontext \
rubygem-ruby-4.0.0-actiontext \
rubygem-ruby-4.0.0-actiontext-8 \
rubygem-ruby-4.0.0-actiontext-8.0 \
rubygem-ruby-4.0.0-actiontext-8.0.5"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-actionpack \
rubygem-ruby-4.0.0-activerecord \
rubygem-ruby-4.0.0-activestorage \
rubygem-ruby-4.0.0-activesupport \
rubygem-ruby-4.0.0-globalid \
rubygem-ruby-4.0.0-nokogiri"

inherit rpm
