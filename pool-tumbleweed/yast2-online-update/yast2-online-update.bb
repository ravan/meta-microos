SUMMARY = "YaST2 - Online Update (YOU)"
DESCRIPTION = "YaST Online Update (YOU) provides a convenient way to download and \
install security and other system updates. By default it uses the \
official SUSE mirrors as the update sources, but it can also use local \
patch repositories or patch CDs. \
 \
This package provides the graphical user interface for YOU which can be \
used with or without the X Window System. It can be started from the \
YaST control center."
LICENSE = "GPL-2.0-only"

PV = "5.0.1"

RPM_NAME = "yast2-online-update-5.0.1-1.2.noarch.rpm"
RPM_HASH = "49ae2e6ef654e14a3c5e46dbd10f2ee841929d84db6e0de8f85c075fa70c8f1ca3fe58ed2b2b2c220b8d1805c6246b8c95cea0b36e7d1bb5013fcd2d41557e2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "y2c-online-update \
y2t-online-update \
yast2-config-online-update \
yast2-online-update \
yast2-trans-online-update"

RDEPENDS:${PN} += "yast2 \
yast2-packager \
yast2-pkg-bindings \
yast2-ruby-bindings"

inherit rpm
