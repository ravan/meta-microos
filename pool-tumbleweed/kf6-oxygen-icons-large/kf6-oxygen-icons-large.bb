SUMMARY = "Oxygen Icon Theme"
DESCRIPTION = "This package contains the large (128x128 and larger) non-scalable icons of the Oxygen icon theme."
LICENSE = "LGPL-3.0-only"

PV = "6.30.0"

RPM_NAME = "kf6-oxygen-icons-large-6.30.0-1.1.noarch.rpm"
RPM_HASH = "78e63c800de1fbc8243f519b8a9b5e2dfb916531e5855dcf1ebe90e19e001c2b8185ed531ab74c81e39e2a9f663a4d53c5774eea9493b54e83ae80a888a6ac85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kf6-oxygen-icons-large \
oxygen-icon-theme-large \
oxygen5-icon-theme-large"

RDEPENDS:${PN} += "kf6-oxygen-icons"

inherit rpm
