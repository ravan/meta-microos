SUMMARY = "PPD files from OpenPrinting.org"
DESCRIPTION = "To set up a printer configuration a printer description file \
(PPD file) is required. \
 \
A printer description file is not a driver. \
 \
For non-PostScript printers a driver is needed \
together with a PPD file which matches exactly \
to the particular driver. \
 \
For PostScript printers, a PPD file alone is sufficient \
(except for older PostScript level 1 printer models). \
 \
The PPD files are provided in the following sub-packages \
depending on which kind of driver software is needed: \
 \
OpenPrintingPPDs-ghostscript provides PPDs \
which use Ghostscript built-in drivers. \
 \
OpenPrintingPPDs-hpijs provides PPDs \
which use the hpijs driver from HPLIP. \
 \
OpenPrintingPPDs-postscript provides PPDs \
which need no driver."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "4.0.0.2"

RPM_NAME = "OpenPrintingPPDs-4.0.0.2-6.17.noarch.rpm"
RPM_HASH = "a5aff7a53508998f8f7a0a4f1d338997395e3884e6abe45be2e2b56dc371514bb574a113dbd06d84f7fcdcbbd52c212431d486c1b2d1ad43e9ea06f6e33325e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "OpenPrintingPPDs"

RDEPENDS:${PN} += ""

inherit rpm
