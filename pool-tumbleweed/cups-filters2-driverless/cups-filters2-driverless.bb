SUMMARY = "OpenPrinting automated driverless printer setup for CUPS 2.x"
DESCRIPTION = "Automated driverless printer setup requires IPP communication with the printer \
for polling capability information from the printer to generate a PPD file \
from what the printer responds to set up a print queue with that PPD file. \
Automated printer setup from what a (possibly fake) printer responds \
is a generic security issue: You must trust the printer because \
the printer's response controlls what print queue gets set up. \
Cf. https://en.opensuse.org/SDB:CUPS_and_SANE_Firewall_settings"
LICENSE = "Apache-2.0"

PV = "2.0.1"

RPM_NAME = "cups-filters2-driverless-2.0.1-1.5.aarch64.rpm"
RPM_HASH = "426bc47bfeb7acc8c46abaa4ea737dc945575981cb148c92b7b42b78df12de9afc316604b41069a7791560320dadd73535cdf5fba9f779af4dc468cd1ae32527"

RPROVIDES:${PN} += "cups-filters2-driverless"

RDEPENDS:${PN} += "/usr/bin/sh \
cups-filters2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcups.so.2 \
libcupsfilters.so.2 \
libppd.so.2"

inherit rpm
