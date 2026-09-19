SUMMARY = "Oxygen icons for Apache 2"
DESCRIPTION = "KDE/Oxygen icons for Apache 2."
LICENSE = "LGPL-3.0-only"

PV = "1.0.1"

RPM_NAME = "apache2-icons-oxygen-1.0.1-2.15.noarch.rpm"
RPM_HASH = "aad6c46802aaef62f7089f49d23a27d950b7aba5abaa79c42105a015926170ea62c4fc750c9d3d8842800ed3bb0b789ba9ec7e1b6195a474de76ea50981e0607"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache2-icons-oxygen \
config-apache2-icons-oxygen"

RDEPENDS:${PN} += "apache2"

inherit rpm
