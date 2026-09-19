SUMMARY = "Mail provides a nice Ruby DSL for making, sending and reading emails"
DESCRIPTION = "A really Ruby Mail handler."
LICENSE = "MIT"

PV = "2.8.1"

RPM_NAME = "ruby4.0-rubygem-mail-2.8.1-1.15.aarch64.rpm"
RPM_HASH = "cc0fb78149a228c217c1d3d5495f5eec33739f4764b833e79c14359e10346b49a0623d7aac01a3c5102622435dba74d665f410f1c1d99a4617cee34ef78530f6"

RPROVIDES:${PN} += "ruby4.0-rubygem-mail \
rubygem-mail \
rubygem-ruby-4.0.0-mail \
rubygem-ruby-4.0.0-mail-2 \
rubygem-ruby-4.0.0-mail-2.8 \
rubygem-ruby-4.0.0-mail-2.8.1"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-mini-mime \
rubygem-ruby-4.0.0-net-imap \
rubygem-ruby-4.0.0-net-pop \
rubygem-ruby-4.0.0-net-smtp"

inherit rpm
