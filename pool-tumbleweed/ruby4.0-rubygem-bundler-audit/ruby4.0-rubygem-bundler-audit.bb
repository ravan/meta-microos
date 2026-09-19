SUMMARY = "Patch-level verification for Bundler"
DESCRIPTION = "bundler-audit provides patch-level verification for Bundled apps."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.2"

RPM_NAME = "ruby4.0-rubygem-bundler-audit-0.9.2-1.11.aarch64.rpm"
RPM_HASH = "15c64c0f63a25f0acb344d501e688f25e2d066253b0aa53d170f4656aeb8d920a60d5d365fa07dfb54c89b86155ae4ec2b4ee9dbd29c99a6f8bbf21f957edd0e"

RPROVIDES:${PN} += "ruby4.0-rubygem-bundler-audit \
rubygem-bundler-audit \
rubygem-ruby-4.0.0-bundler-audit \
rubygem-ruby-4.0.0-bundler-audit-0 \
rubygem-ruby-4.0.0-bundler-audit-0.9 \
rubygem-ruby-4.0.0-bundler-audit-0.9.2"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby4.0 \
alts \
ruby-abi \
rubygem-ruby-4.0.0-bundler \
rubygem-ruby-4.0.0-thor-1"

inherit rpm
