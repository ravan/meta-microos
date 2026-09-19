SUMMARY = "Widget to display the current color temperature of redshift"
DESCRIPTION = "Displays the current color temperature of redshift. Takes no parameters."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-redshift-2.1.5-4.7.noarch.rpm"
RPM_HASH = "0b278ec072f9c34f38aa9d1e289fc5b5cf6ea6b337b9ce1cbf31c11b50ee83ca5c770a1928dc9ab5457cf20db8bfd7e0d15b795ac7bb355ef08806cce14327cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-redshift"

RDEPENDS:${PN} += "bumblebee-status \
redshift"

inherit rpm
