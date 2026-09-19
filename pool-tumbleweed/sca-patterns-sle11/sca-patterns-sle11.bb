SUMMARY = "Supportconfig Analysis Patterns for SLE11"
DESCRIPTION = "Supportconfig Analysis (SCA) appliance patterns to identify known \
issues relating to all versions of SLE11 \
 \
See /usr/share/doc/packages/sca-patterns-base/COPYING.GPLv2"
LICENSE = "GPL-2.0-only"

PV = "1.5.4"

RPM_NAME = "sca-patterns-sle11-1.5.4-1.9.noarch.rpm"
RPM_HASH = "a07c49e25a81ba777736f598d1e55634c58f6a53b994b2a4dadd3ac4bfcd66d85dbc4cdb8a33b5c41aa41dd635b9c11dbd6ea0740a85e3abb186521e008b1df1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sca-patterns-sle11"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/python3 \
sca-patterns-base"

inherit rpm
