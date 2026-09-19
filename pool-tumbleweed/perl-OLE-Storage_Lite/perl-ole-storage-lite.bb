SUMMARY = "Read and write OLE storage files"
DESCRIPTION = "OLE::Storage_Lite allows you to read and write an OLE structured file. \
 \
OLE::Storage_Lite::PPS is a class representing PPS. \
OLE::Storage_Lite::PPS::Root, OLE::Storage_Lite::PPS::File and \
OLE::Storage_Lite::PPS::Dir are subclasses of OLE::Storage_Lite::PPS."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.240.0"

RPM_NAME = "perl-OLE-Storage_Lite-0.240.0-1.5.noarch.rpm"
RPM_HASH = "df891b6e6392f14805a7dd2a9721a8b82b0523c4ad4603a379592a34a0a2934e86119f51b9799a77bde6c258772cc3474b0c5863ee079baaea94c6ae65be5594"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-OLE--Storage-Lite \
perl-OLE--Storage-Lite--PPS \
perl-OLE--Storage-Lite--PPS--Dir \
perl-OLE--Storage-Lite--PPS--File \
perl-OLE--Storage-Lite--PPS--Root \
perl-OLE-Storage-Lite"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
