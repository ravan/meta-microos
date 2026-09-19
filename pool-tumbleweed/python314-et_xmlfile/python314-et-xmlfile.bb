SUMMARY = "An implementation of lxml.xmlfile for the standard library"
DESCRIPTION = "et_xmlfile is a low memory library for creating large XML files. \
 \
It is based upon the xmlfile module from lxml with the aim of allowing code to \
be developed that will work with both libraries. It was developed initially for \
the openpyxl project but is now a standalone module."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python314-et_xmlfile-2.0.0-2.4.noarch.rpm"
RPM_HASH = "9744bade9dafd10b3087cf55dd1d52fda1178751731d0977e9ed5cabb47ca65cd13e055dd8a04fb59978a045b5764c562812b761fd9b3a88f208d95a52060e10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-et-xmlfile \
python314-et-xmlfile \
python3dist-et-xmlfile"

RDEPENDS:${PN} += "python-abi \
python314-jdcal \
python314-lxml"

inherit rpm
