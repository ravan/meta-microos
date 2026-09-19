SUMMARY = "A tool for finding package information"
DESCRIPTION = "Pin - Package InformatioN. Pin searches the installed packages (rpm \
-qi, -ql) and the ARCHIVES.gz file for the desired information. It \
shows README, README.SuSE, and FAQ, when available."
LICENSE = "GPL-2.0+"

PV = "0.40"

RPM_NAME = "pin-0.40-2.19.noarch.rpm"
RPM_HASH = "dae121418b708aa95471674f539a9e359dac6907ad3e93d3fb103d9e701f683b85ad2eb96be015dd96b817dea7e268c3abc6baf31cbfbf7f4c7f5a0be146ed65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pin"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
