SUMMARY = "Main Warewulf daemon and utilities"
DESCRIPTION = "Warewulf is a scalable systems management suite originally developed to \
manage large high-performance Linux clusters. Focused on general \
scalable system management, it includes a framework for system \
configuration, management, provisioning/installation, monitoring, event \
notification, and more via a modular plugin architecture. \
 \
This is the main package which includes the command line interface, \
initialization script, and configuration definition. All other warewulf \
modules depend on this module for configuration information."
LICENSE = "BSD-3-Clause-LBNL"

PV = "3.8.1"

RPM_NAME = "warewulf-common-3.8.1-14.10.noarch.rpm"
RPM_HASH = "c1103558bb063a9def70c80bbe12be540a2b10419435caff8e91ee42d4eb7f23f53e5b21079f365aa1738a1ac65bd5b7e43c575f7cd0415c0249ca692ff5d01f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "warewulf-common"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
group-warewulf \
mysql \
perl-warewulf-common \
shadow \
warewulf-doc"

inherit rpm
