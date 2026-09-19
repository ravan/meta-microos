SUMMARY = "Deploy web apps in containers to servers running Docker with zero"
DESCRIPTION = "Deploy web apps in containers to servers running Docker with zero downtime."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "ruby4.0-rubygem-kamal-2.4.0-1.8.aarch64.rpm"
RPM_HASH = "6850f06e498c9c44486c24153628fe3a3209bc644ebdd70e9af188f2cd250ba6acb6d17dd04ba5b311c21dad609cadb8f6e9b35b2bd7d5482efff56ea6296572"

RPROVIDES:${PN} += "ruby4.0-rubygem-kamal \
rubygem-kamal \
rubygem-ruby-4.0.0-kamal \
rubygem-ruby-4.0.0-kamal-2 \
rubygem-ruby-4.0.0-kamal-2.4 \
rubygem-ruby-4.0.0-kamal-2.4.0"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby4.0 \
/usr/bin/sh \
alts \
ruby-abi \
rubygem-ruby-4.0.0-activesupport \
rubygem-ruby-4.0.0-base64-0 \
rubygem-ruby-4.0.0-bcrypt-pbkdf-1 \
rubygem-ruby-4.0.0-concurrent-ruby-1 \
rubygem-ruby-4.0.0-dotenv-3 \
rubygem-ruby-4.0.0-ed25519-1 \
rubygem-ruby-4.0.0-net-ssh-7 \
rubygem-ruby-4.0.0-sshkit \
rubygem-ruby-4.0.0-thor-1 \
rubygem-ruby-4.0.0-zeitwerk"

inherit rpm
