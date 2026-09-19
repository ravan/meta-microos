SUMMARY = "Monospace Font Designed for Printed Code Listings"
DESCRIPTION = "Inconsolata Bold is a Unicode typeface family that supports \
languages that use the Latin script and its variants, and \
could be expanded to support other scripts. \
 \
Designer: Raph Levien"
LICENSE = "OFL-1.1"

PV = "3.000"

RPM_NAME = "google-inconsolata-fonts-3.000-1.17.noarch.rpm"
RPM_HASH = "ce398941eb6ad8d8b414e311d0ac266920d8f4bb4aa9c29c16b27e7e28f816b856061a0a0e5724f74a5a671180c73e94e6055814c48a6749059c22ddc4d9ca31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-inconsolata-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
