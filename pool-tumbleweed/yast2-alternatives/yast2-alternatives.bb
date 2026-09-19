SUMMARY = "YaST2 - Manage Update-alternatives switching"
DESCRIPTION = "A YaST2 module to manage update alternatives switching"
LICENSE = "GPL-2.0-only"

PV = "5.0.1"

RPM_NAME = "yast2-alternatives-5.0.1-1.2.aarch64.rpm"
RPM_HASH = "f0db84d98aa3027f27651a560774e95dfc5c67db9c7f51ea90cbaf95222b87770601235b436acb46c3e69192ef29ff9f93037f98174007205654b82d93f81509"

RPROVIDES:${PN} += "yast2-alternatives"

RDEPENDS:${PN} += ""

inherit rpm
