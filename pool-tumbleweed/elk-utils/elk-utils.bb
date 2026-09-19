SUMMARY = "Utilities used to analyse results from elk"
DESCRIPTION = "This package provides utilities useful for analysis elk outputs."
LICENSE = "GPL-3.0-or-later"

PV = "8.7.2"

RPM_NAME = "elk-utils-8.7.2-2.13.noarch.rpm"
RPM_HASH = "d1d821d1d94c50b7fe99de58c474c8bc2da806ce36c6039e931e5b56684aadaab932e5f7b5e7aa9f4969a7c66d50e91b4d884f84526380603f99406a68111036"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "elk-utils"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/python3 \
awk \
elk-data \
gnuplot"

inherit rpm
