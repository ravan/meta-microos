SUMMARY = "The Apache HTTPD Server"
DESCRIPTION = "The Apache HTTP Server Project is an effort to develop and \
maintain an open-source HTTP server for modern operating \
systems including UNIX and Windows. The goal of this project \
is to provide a secure, efficient and extensible server that \
provides HTTP services in sync with the current HTTP standards."
LICENSE = "Apache-2.0"

PV = "2.4.67"

RPM_NAME = "apache2-manual-2.4.67-1.3.noarch.rpm"
RPM_HASH = "30277dc47a1325f806abaf24093a1d3dddbe2e7386273f7e72729f15be39119a2dc83ee1ed28d808c73300a73daf47d18dabdcd41766015add7c9e028dffde60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache2-doc \
apache2-manual \
config-apache2-manual"

RDEPENDS:${PN} += ""

inherit rpm
