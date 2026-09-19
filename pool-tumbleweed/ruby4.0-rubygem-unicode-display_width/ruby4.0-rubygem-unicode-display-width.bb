SUMMARY = "Determines the monospace display width of a string in Ruby"
DESCRIPTION = "[Unicode 16.0.0] Determines the monospace display width of a string using \
EastAsianWidth.txt, Unicode general category, and other data."
LICENSE = "MIT"

PV = "2.6.0"

RPM_NAME = "ruby4.0-rubygem-unicode-display_width-2.6.0-1.10.aarch64.rpm"
RPM_HASH = "cf312e8519d4ea3bac991803f271304551899cab50f2433c459023af9a09d86facf386e9d14de084a95ce814333bfd2b1d0ebadeaeba427446386a154388beeb"

RPROVIDES:${PN} += "ruby4.0-rubygem-unicode-display-width \
rubygem-ruby-4.0.0-unicode-display-width \
rubygem-ruby-4.0.0-unicode-display-width-2 \
rubygem-ruby-4.0.0-unicode-display-width-2.6 \
rubygem-ruby-4.0.0-unicode-display-width-2.6.0 \
rubygem-unicode-display-width"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
