SUMMARY = "A CGI graph server script that uses tcldot from graphviz"
DESCRIPTION = "A cgi-bin program that produces clickable graphs in web pages when \
provided with an href to a .dot file.  Uses Tcldot from the graphviz \
rpm. By default, only requests from localhost are served."
LICENSE = "BSD-3-Clause"

PV = "2.30"

RPM_NAME = "webdot-2.30-6.7.noarch.rpm"
RPM_HASH = "58c2582db76d9bd9873d1a4cffa0ca651b22ddedb87fe51f2d7610f8d5c77a8f011cc1463c1020336fa86819f6b2b250ad6ced2f7f22905537c348820e2089c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "webdot"

RDEPENDS:${PN} += "filesystem \
fileutils \
ghostscript \
group-www \
http-daemon \
user-wwwrun"

inherit rpm
