SUMMARY = "Generate rpm specfiles from gems"
DESCRIPTION = "Generate source rpms and rpm spec files from a Ruby Gem. \
The spec file tries to follow the gem as closely as possible"
LICENSE = "GPL-2.0-or-later"

PV = "0.10.1"

RPM_NAME = "ruby4.0-rubygem-gem2rpm-0.10.1-30.3.aarch64.rpm"
RPM_HASH = "93b48e21776da1fe97d7491f1b97569a0bf8dee24d4d172ddfb301c2e14b42c9edd0b2fd2e9ec788b2534ec990d2399ea50a9316e2ee0ca4fd6fe9fac905938e"

RPROVIDES:${PN} += "ruby4.0-rubygem-gem2rpm \
rubygem-gem2rpm \
rubygem-ruby-4.0.0-gem2rpm \
rubygem-ruby-4.0.0-gem2rpm-0 \
rubygem-ruby-4.0.0-gem2rpm-0.10 \
rubygem-ruby-4.0.0-gem2rpm-0.10.1"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby4.0 \
alts \
ruby-abi"

inherit rpm
