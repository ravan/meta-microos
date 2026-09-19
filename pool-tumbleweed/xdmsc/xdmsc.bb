SUMMARY = "XTerminal -- Use SUSE Linux as an X Terminal"
DESCRIPTION = "Some useful scripts for using SUSE Linux as an X terminal. \
 \
You will find the documentation in the following directory \
 \
/usr/share/doc/packages/xdmsc/"
LICENSE = "GPL-2.0"

PV = "0.6"

RPM_NAME = "xdmsc-0.6-3.7.noarch.rpm"
RPM_HASH = "992346e1e17262dc9790000e8a84646a312b86595593ec35638128f54725f314a0e6206c688ec0907e0ea123b0148ee779c54cdd3fe341dffe42b56cebb4a670"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "Xterminal \
xdmsc"

RDEPENDS:${PN} += "/usr/bin/sh \
fillup"

inherit rpm
