SUMMARY = "a library for building easy-to-use command-line tools"
DESCRIPTION = "Cri allows building easy-to-use command-line interfaces with support for \
subcommands."
LICENSE = "MIT"

PV = "2.15.12"

RPM_NAME = "ruby4.0-rubygem-cri-2.15.12-1.11.aarch64.rpm"
RPM_HASH = "bdc5923c22d72e157b4c0acb1b867c91ab98d4819b5b739d65c279f81e086610ffa4c805ccbf79ad2376cb4c22946740861c8c55fb8b0b60ebadb9135c16ee5f"

RPROVIDES:${PN} += "ruby4.0-rubygem-cri \
rubygem-cri \
rubygem-ruby-4.0.0-cri \
rubygem-ruby-4.0.0-cri-2 \
rubygem-ruby-4.0.0-cri-2.15 \
rubygem-ruby-4.0.0-cri-2.15.12"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
