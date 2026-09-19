SUMMARY = "OBS Post check for containing tik-osimage-* images in RPM"
DESCRIPTION = "OBS Post check for containing tik-osimage-* images in RPM"
LICENSE = "MIT"

PV = "1.0"

RPM_NAME = "containment-tik-img-to-rpm-1.0-4.7.noarch.rpm"
RPM_HASH = "337009952eef8d8b83d08348e9c6e535ed07e991821e07e53aed50f869227a964a2595a684eda36ab6d5382e6ca16bf91740056acfbeb60d00a0dd5b81a4204a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "containment-tik-img-to-rpm"

RDEPENDS:${PN} += "/usr/bin/sh \
build \
coreutils \
gawk \
jq \
perl-DateTime-Format-DateParse"

inherit rpm
