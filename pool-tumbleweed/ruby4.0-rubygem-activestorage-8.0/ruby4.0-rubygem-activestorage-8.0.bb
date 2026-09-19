SUMMARY = "Local and cloud file storage framework"
DESCRIPTION = "Attach cloud and local files in Rails applications."
LICENSE = "MIT"

PV = "8.0.5"

RPM_NAME = "ruby4.0-rubygem-activestorage-8.0-8.0.5-1.2.aarch64.rpm"
RPM_HASH = "7daacb73a9f585c7c866584d53e90605b56e562bf2bc0ec747285239d7d5329f2690881e289fcb4c76b061d0693ee1851be622b4b647eadec0ce1f26b3668902"

RPROVIDES:${PN} += "ruby4.0-rubygem-activestorage-8.0 \
rubygem-activestorage \
rubygem-ruby-4.0.0-activestorage \
rubygem-ruby-4.0.0-activestorage-8 \
rubygem-ruby-4.0.0-activestorage-8.0 \
rubygem-ruby-4.0.0-activestorage-8.0.5"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-actionpack \
rubygem-ruby-4.0.0-activejob \
rubygem-ruby-4.0.0-activerecord \
rubygem-ruby-4.0.0-activesupport \
rubygem-ruby-4.0.0-marcel-1"

inherit rpm
