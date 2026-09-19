SUMMARY = "Library for validating email addresses in Rails 3 models"
DESCRIPTION = "Library for validating email addresses in Rails 3 models."
LICENSE = "MIT"

PV = "0.1.6"

RPM_NAME = "ruby4.0-rubygem-validate_email-0.1.6-1.38.aarch64.rpm"
RPM_HASH = "ac9969dfefecf42f89f4daa7788ac9233338657322eaa0a22905ebbe5d6c0dee06bd772415e92d08e762fd7770c10717953c8722458dd216e5b19bfe3a949746"

RPROVIDES:${PN} += "ruby4.0-rubygem-validate-email \
rubygem-ruby-4.0.0-validate-email \
rubygem-ruby-4.0.0-validate-email-0 \
rubygem-ruby-4.0.0-validate-email-0.1 \
rubygem-ruby-4.0.0-validate-email-0.1.6 \
rubygem-validate-email"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-activemodel \
rubygem-ruby-4.0.0-mail"

inherit rpm
