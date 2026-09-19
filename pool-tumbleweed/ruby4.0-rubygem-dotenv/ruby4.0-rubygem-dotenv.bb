SUMMARY = "Loads environment variables from `.env`"
DESCRIPTION = "Loads environment variables from `.env`."
LICENSE = "MIT"

PV = "3.2.0"

RPM_NAME = "ruby4.0-rubygem-dotenv-3.2.0-1.2.aarch64.rpm"
RPM_HASH = "b0c0ea221367a796381a3e308558b803de231c73a77456abe1c13cd5864e97f5761862ea3b8ff7fd61356e8736eb0a2c154b3555e07c4cddefc1983df7e7c0c3"

RPROVIDES:${PN} += "ruby4.0-rubygem-dotenv \
rubygem-dotenv \
rubygem-ruby-4.0.0-dotenv \
rubygem-ruby-4.0.0-dotenv-3 \
rubygem-ruby-4.0.0-dotenv-3.2 \
rubygem-ruby-4.0.0-dotenv-3.2.0"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby4.0 \
alts \
ruby-abi"

inherit rpm
