SUMMARY = "A tool for analyzing Nmap scans"
DESCRIPTION = "Converts/manipulates/extracts data from a Nmap scan output."
LICENSE = "BSD-3-Clause"

PV = "1.5.1"

RPM_NAME = "nmap-parse-output-1.5.1-3.7.noarch.rpm"
RPM_HASH = "860e7904a88fefde3419d2e3fa621585fe5580c92c86b20649c00d4e26572d090ac3b409d22eccc6adeaf5eff70f4653a43d333bdd6a08a96757d06032805c4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nmap-parse-output"

RDEPENDS:${PN} += "/usr/bin/bash \
bash \
libxslt-tools"

inherit rpm
