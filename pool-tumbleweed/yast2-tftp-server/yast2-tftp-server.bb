SUMMARY = "YaST2 - TFTP Server Configuration"
DESCRIPTION = "The YaST2 component for configuring a TFTP server. TFTP stands for \
Trivial File Transfer Protocol. It is used for booting over the \
network."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.1"

RPM_NAME = "yast2-tftp-server-5.0.1-1.2.noarch.rpm"
RPM_HASH = "cf35ac43c7d0bc144d0e6aa3373ee36a0612684a2a43a670c314892d27c3b681840cb1595c40a2e433b8eeec7884e9c85066769d6de9ad13873070604dc4e7a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-tftp-server"

RDEPENDS:${PN} += "augeas-lenses \
lsof \
rubygem-ruby-4.0.0-cfa \
yast2 \
yast2-journal \
yast2-ruby-bindings"

inherit rpm
