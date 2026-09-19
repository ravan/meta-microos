SUMMARY = "Sans-serif Font Metrics-compatible with Calibri"
DESCRIPTION = "Modern, friendly sans-serif font derived from the Lato font that is \
designed to be a metrics-compatible drop-in replacement for Calibri. \
Contains Regular, Bold, Italic, and Bold Italic version. \
 \
Designed by Lukasz Dziedzic of tyPoland for Google."
LICENSE = "OFL-1.1"

PV = "1.1.03.beta1"

RPM_NAME = "google-carlito-fonts-1.1.03.beta1-3.25.noarch.rpm"
RPM_HASH = "64860335feaeca10f98fdd2c3bb22509e9b96b692ab42e064bdfaa2394c9a4b7d79578f5cd5bd2c0e56e733337881880943ba46f8a15b18924ae98863771d9af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-carlito-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
