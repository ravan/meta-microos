SUMMARY = "Fully colorized df clone written in python"
DESCRIPTION = "pydf displays the amount of used and available space on your file systems, \
just like df, but in colors. The output format is completely customizable."
LICENSE = "SUSE-Public-Domain"

PV = "16"

RPM_NAME = "pydf-16-1.2.noarch.rpm"
RPM_HASH = "ccc552c92dfbeba93501148262b72dead38b0703d7fcc1466fcb55d35cf446bd2567c0022ecd490884ce8491be2b1e1769cda739eb88b0d4807b936970adc552"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-pydf \
pydf"

RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
