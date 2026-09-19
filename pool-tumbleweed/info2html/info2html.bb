SUMMARY = "Program to Convert Info Pages into HTML Pages"
DESCRIPTION = "This package contains the CGI script 'info2html' that creates HTML pages \
from info documents on demand, to be sent over the HTTP protocol. \
 \
Follow references to nodes in info documents to view the corresponding info \
files in HTML. \
 \
 \
Authors: \
-------- \
    Karl Guggisberg  <guggis@iam.unibe.ch>"
LICENSE = "GPL-2.0-or-later"

PV = "2.0"

RPM_NAME = "info2html-2.0-224.4.noarch.rpm"
RPM_HASH = "58d8377746a39843d0031c2bbc38db47b2a5d85ad516adbbc0bb2ee7fd3178d379d49aa3978a5b022db4b533d37d826b992a4a54123a6023a4e7fe05e58e0bec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-info2html \
inf2htm \
info2html"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
