SUMMARY = "YaST2 - Sudo configuration"
DESCRIPTION = "The YaST2 component for sudo configuration. It configures capabilities \
of users to run commands as root or other user."
LICENSE = "GPL-2.0-only"

PV = "5.0.1"

RPM_NAME = "yast2-sudo-5.0.1-1.2.noarch.rpm"
RPM_HASH = "d29cb64bcb91d5372820c67899751dff36c20464ec17d37b266201aff65dbe79b8f42a47ccc26ad29b5dd5f1f24c20e5f675cdcf284eb1eda037f16107b50d38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-sudo"

RDEPENDS:${PN} += "/usr/bin/perl \
yast2 \
yast2-ruby-bindings \
yast2-users"

inherit rpm
