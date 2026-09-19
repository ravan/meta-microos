SUMMARY = "Python humanize utilities"
DESCRIPTION = "This modest package contains various common humanization utilities, like turning \
a number into a fuzzy human readable duration ('3 minutes ago') or into a human \
readable size or throughput."
LICENSE = "MIT"

PV = "4.16.0"

RPM_NAME = "python313-humanize-4.16.0-1.1.noarch.rpm"
RPM_HASH = "399c00d9e6da5c5bb75476fdd4b55a811f378eff11a1e3469f850012c34dcfe043bc2b153c7eab5ec37bb7381e826a41257f86117700e748ccf6430b0f20224e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-humanize \
python3.13dist-humanize \
python313-humanize \
python3dist-humanize"

RDEPENDS:${PN} += "python-abi"

inherit rpm
