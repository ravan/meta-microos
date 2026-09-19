SUMMARY = "Ruby-Locale is the pure ruby library which provides basic APIs for"
DESCRIPTION = "Ruby-Locale is the pure ruby library which provides basic APIs for \
localization."
LICENSE = "Ruby & LGPL-3.0-or-later"

PV = "2.1.4"

RPM_NAME = "ruby4.0-rubygem-locale-2.1.4-1.11.aarch64.rpm"
RPM_HASH = "049e02914509538f17fb40e3fc3470a6efbde808336bc8a08318715810cd7c0f8b84c19effb57b1ab8822417aab456987a9bc7efefe696df0e9098cd381e3b17"

RPROVIDES:${PN} += "ruby4.0-rubygem-locale \
rubygem-locale \
rubygem-ruby-4.0.0-locale \
rubygem-ruby-4.0.0-locale-2 \
rubygem-ruby-4.0.0-locale-2.1 \
rubygem-ruby-4.0.0-locale-2.1.4"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
