SUMMARY = "YaST2 - Samba AD DC provision"
DESCRIPTION = "This package contains the YaST2 component to configure samba as an Active \
Directory Domain Controller."
LICENSE = "GPL-2.0-only"

PV = "1.0.6"

RPM_NAME = "yast2-samba-provision-1.0.6-1.2.noarch.rpm"
RPM_HASH = "8700918450eac3403a9f367c894a09f9bd17c7888049071a81aa052f2125d78c15b0743898677ff07de6b50d08f3dd77c6a94c44c186cdda8299435812001311"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-samba-provision"

RDEPENDS:${PN} += "yast2 \
yast2-network \
yast2-python3-bindings \
yast2-ruby-bindings"

inherit rpm
