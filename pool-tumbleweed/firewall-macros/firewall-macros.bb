SUMMARY = "FirewallD RPM macros"
DESCRIPTION = "This package provides the firewalld RPM macros file needed by packages \
which provide their own firewalld service files."
LICENSE = "GPL-2.0-or-later"

PV = "2.3.2"

RPM_NAME = "firewall-macros-2.3.2-2.1.noarch.rpm"
RPM_HASH = "f460fc03751c248381b571433509fda2c4b2c641c2c22fee1683fe07d5a0a2f22a7b26412b7a070c2a81391eb31ef0ac4fe7aee11f36382a8f5679e28921077c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firewall-macros \
rpm-macro-firewalld-reload"

RDEPENDS:${PN} += ""

inherit rpm
