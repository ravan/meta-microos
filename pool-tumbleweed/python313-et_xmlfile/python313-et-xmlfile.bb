SUMMARY = "An implementation of lxml.xmlfile for the standard library"
DESCRIPTION = "et_xmlfile is a low memory library for creating large XML files. \
 \
It is based upon the xmlfile module from lxml with the aim of allowing code to \
be developed that will work with both libraries. It was developed initially for \
the openpyxl project but is now a standalone module."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python313-et_xmlfile-2.0.0-2.4.noarch.rpm"
RPM_HASH = "e562240cdd1409b471683edcd3a46c34202239dd9f4810cdf935e8ddcb9469c82e1fdec7b45f1099a0fe2850ad4b5c5abd158e1fa41d3ea73dcbb7aa6dcb12e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-et-xmlfile \
python3.13dist-et-xmlfile \
python313-et-xmlfile \
python3dist-et-xmlfile"

RDEPENDS:${PN} += "python-abi \
python313-jdcal \
python313-lxml"

inherit rpm
