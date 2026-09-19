SUMMARY = "YaST2 - Services Manager"
DESCRIPTION = "Provides user interface and libraries to configure systemd \
services and targets."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.3"

RPM_NAME = "yast2-services-manager-5.0.3-1.2.noarch.rpm"
RPM_HASH = "d59d0971640ade039483633cafc67015d259a147187d2e6d86c00255f8056c438218d5ab39679170a6200eafee4ca247f5f560169b86cb316c34c4d502ce4ef7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-services-manager"

RDEPENDS:${PN} += "ruby \
yast2 \
yast2-ruby-bindings"

inherit rpm
