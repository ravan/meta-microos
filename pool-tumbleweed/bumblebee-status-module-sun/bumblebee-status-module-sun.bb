SUMMARY = "Widget to display sunrise and sunset times"
DESCRIPTION = "Widget to display sunrise and sunset times."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-sun-2.1.5-4.7.noarch.rpm"
RPM_HASH = "26e3aace79556d3014920c6b2df6f1958351626ac8c73e0eccec7cbff19ce5250dde6ead7fba1c98e7f347784f47c819e998e730b03f54292c823085ba49947b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-sun"

RDEPENDS:${PN} += "bumblebee-status \
python3-python-dateutil \
python3-suntime"

inherit rpm
