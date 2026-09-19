SUMMARY = "CSV Reading and Writing"
DESCRIPTION = "The CSV library provides a complete interface to CSV files and data. It offers \
tools to enable you to read and write to and from Strings or IO objects, as \
needed."
LICENSE = "BSD-2-Clause & Ruby"

PV = "3.3.0"

RPM_NAME = "ruby4.0-rubygem-csv-3.3.0-1.11.aarch64.rpm"
RPM_HASH = "4db7ef5f251643bbb84762ca46cf6598f4a54e9da7841aa422638419d27e680bbe5118de8bbe1f9715b5885810ce3ec352ef224d8cb27e25a1afdaf34a1e2b3e"

RPROVIDES:${PN} += "ruby4.0-rubygem-csv \
rubygem-csv \
rubygem-ruby-4.0.0-csv \
rubygem-ruby-4.0.0-csv-3 \
rubygem-ruby-4.0.0-csv-3.3 \
rubygem-ruby-4.0.0-csv-3.3.0"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
