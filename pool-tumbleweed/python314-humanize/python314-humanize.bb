SUMMARY = "Python humanize utilities"
DESCRIPTION = "This modest package contains various common humanization utilities, like turning \
a number into a fuzzy human readable duration ('3 minutes ago') or into a human \
readable size or throughput."
LICENSE = "MIT"

PV = "4.16.0"

RPM_NAME = "python314-humanize-4.16.0-1.1.noarch.rpm"
RPM_HASH = "806c50ad3bebcce649013ea962e5c656b21d2c3187d7d1c4c8b351e1584d041495cad2ae067a94809412506d2cc9f82f9ad2f827fe1e1c96215b3c34cef39446"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-humanize \
python314-humanize \
python3dist-humanize"

RDEPENDS:${PN} += "python-abi"

inherit rpm
