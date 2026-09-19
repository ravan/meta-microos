SUMMARY = "Inbound email handling framework"
DESCRIPTION = "Receive and process incoming emails in Rails applications."
LICENSE = "MIT"

PV = "8.0.5"

RPM_NAME = "ruby4.0-rubygem-actionmailbox-8.0-8.0.5-1.2.aarch64.rpm"
RPM_HASH = "636a964c5ad0bbb311833f9a87288e166ac7c8fd1cedaebfdf44d247c1736b2a3f1cd1b03e37eb6a83d0c4a7ef2107a09b9b11216263706c194c1cb21a415ed3"

RPROVIDES:${PN} += "ruby4.0-rubygem-actionmailbox-8.0 \
rubygem-actionmailbox \
rubygem-ruby-4.0.0-actionmailbox \
rubygem-ruby-4.0.0-actionmailbox-8 \
rubygem-ruby-4.0.0-actionmailbox-8.0 \
rubygem-ruby-4.0.0-actionmailbox-8.0.5"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-actionpack \
rubygem-ruby-4.0.0-activejob \
rubygem-ruby-4.0.0-activerecord \
rubygem-ruby-4.0.0-activestorage \
rubygem-ruby-4.0.0-activesupport \
rubygem-ruby-4.0.0-mail"

inherit rpm
