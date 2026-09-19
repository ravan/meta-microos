SUMMARY = "AirPrint for CUPS printers"
DESCRIPTION = "Tools for setting up AirPrint for CUPS printers on openSUSE. \
 \
AirPrint is an Apple technology that helps you create full-quality printed \
output from iOS or OS X devices without the need to download or install \
drivers. \
 \
Some printers support AirPrint natively; for those you don't need CUPS \
AirPrint support. For any other printer, if it can be printed to via CUPS \
on openSUSE, this package provides the additional tools and configuration \
files needed to add CUPS AirPrint support for basic printing tasks from \
iOS or OS X devices. For limitations see the 'caveats' section in: \
  /usr/share/doc/packages/cups-airprint/README.SUSE \
 \
Some post-install configuration changes have to be performed manually to make \
AirPrint work; please follow the instructions in: \
  /usr/share/doc/packages/cups-airprint/README.SUSE"
LICENSE = "MIT"

PV = "1.2"

RPM_NAME = "cups-airprint-1.2-1.1.noarch.rpm"
RPM_HASH = "a2118d54f0f3597d71799daea6af1588abfb7d448f3e8ee5d3c0ed5dbe1921a2e6ad137561759dee3d47de6167abf8b47251b33995f54639fe76fe322782ba2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cups-airprint"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
avahi \
cups \
cups-filters \
python3-pycups \
python3-xml"

inherit rpm
