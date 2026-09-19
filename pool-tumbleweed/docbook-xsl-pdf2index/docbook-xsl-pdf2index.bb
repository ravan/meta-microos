SUMMARY = "Script to create Indices for FOP"
DESCRIPTION = " \
Contains the script pdf2index which creates indices for FOP."
LICENSE = "MIT & MPL-1.1"

PV = "1.79.2.2"

RPM_NAME = "docbook-xsl-pdf2index-1.79.2.2-2.7.noarch.rpm"
RPM_HASH = "a51f4583bf468a016128c9496aa074500f01ae454b956f4c571995209d661ff14a77f8bea6eda27c972c7f6bb4ce4808821bdf5d7f391c9386468fbf0181c96c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docbook-xsl-pdf2index"

RDEPENDS:${PN} += "/usr/bin/perl \
ImageMagick \
perl"

inherit rpm
