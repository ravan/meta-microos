SUMMARY = "Info pages and Open Source Development with CVS, 2nd Edition Book"
DESCRIPTION = "Info pages for cvs, an introduction to cvs \
(/usr/share/cvs/contrib/intro.doc) and the complete book 'Open Source \
Development with CVS, 2nd Edition'."
LICENSE = "GPL-2.0-only"

PV = "1.12.13"

RPM_NAME = "cvs-doc-1.12.13-5.4.noarch.rpm"
RPM_HASH = "bdf4e21e5cb01459f8673555d0020a9a75089da53a63c3280746103e93bc3c5c746cd2a2b9138eec7090bd852a5caf9f6932cb38cbea48249fef65433dbc4933"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cvs-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
