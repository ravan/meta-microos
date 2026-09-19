SUMMARY = "Fluentd event collector"
DESCRIPTION = "Fluentd is an open source data collector designed to scale and simplify log \
management. It can collect, process and ship many kinds of data in near \
real-time."
LICENSE = "Apache-2.0"

PV = "1.17.1"

RPM_NAME = "ruby4.0-rubygem-fluentd-1.17.1-1.11.aarch64.rpm"
RPM_HASH = "3c5093df396883cf665d20cf8a92dbb5a4cf80dad67d1bbd0b45a4e1069a5907da6d404859852ecdeb4b4eb9446d10d1763d6ecbef7114a66bda1328511bf2df"

RPROVIDES:${PN} += "ruby4.0-rubygem-fluentd \
rubygem-fluentd \
rubygem-ruby-4.0.0-fluentd \
rubygem-ruby-4.0.0-fluentd-1 \
rubygem-ruby-4.0.0-fluentd-1.17 \
rubygem-ruby-4.0.0-fluentd-1.17.1"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/ruby.ruby4.0 \
alts \
ruby-abi \
rubygem-ruby-4.0.0-base64-0 \
rubygem-ruby-4.0.0-bundler \
rubygem-ruby-4.0.0-cool.io \
rubygem-ruby-4.0.0-csv-3 \
rubygem-ruby-4.0.0-drb-2 \
rubygem-ruby-4.0.0-http-parser.rb \
rubygem-ruby-4.0.0-logger-1 \
rubygem-ruby-4.0.0-msgpack \
rubygem-ruby-4.0.0-serverengine \
rubygem-ruby-4.0.0-sigdump-0.2 \
rubygem-ruby-4.0.0-strptime \
rubygem-ruby-4.0.0-tzinfo \
rubygem-ruby-4.0.0-tzinfo-data-1 \
rubygem-ruby-4.0.0-webrick-1 \
rubygem-ruby-4.0.0-yajl-ruby-1"

inherit rpm
