SUMMARY = "YaST2 - Auto Installation Modules"
DESCRIPTION = "This package performs auto-installation relying on a control file \
generated with the autoyast2 package."
LICENSE = "GPL-2.0-only"

PV = "5.0.10"

RPM_NAME = "autoyast2-installation-5.0.10-1.1.noarch.rpm"
RPM_HASH = "a8515481ec59625e4231ced2f32c64269f906a71c9a5949037ab91ec865673baaaffb51191d05e5a350b34a9803968fea868c72fec76e28500b62366d63f452d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "autoyast2-installation \
yast2-trans-autoinst"

RDEPENDS:${PN} += "/usr/bin/sh \
yast2 \
yast2-bootloader \
yast2-core \
yast2-country \
yast2-ntp-client \
yast2-packager \
yast2-pkg-bindings \
yast2-ruby-bindings \
yast2-services-manager \
yast2-slp \
yast2-transfer \
yast2-update \
yast2-xml"

inherit rpm
