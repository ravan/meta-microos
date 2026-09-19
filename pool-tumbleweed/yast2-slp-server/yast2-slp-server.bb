SUMMARY = "YaST2 SLP Daemon Server Configuration"
DESCRIPTION = "This package contains the YaST2 component for the configuration of an \
SLP daemon."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.1"

RPM_NAME = "yast2-slp-server-5.0.1-1.2.noarch.rpm"
RPM_HASH = "2a1d0823d61e155a6b49e571888aa231d7aebab5e515bc1b6ef3e0443d5fdfa629c3379e57da78e06da63765e9cd9468b28bfe8dded5507c3923586f2f4dc23c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-slp-server"

RDEPENDS:${PN} += "yast2 \
yast2-ruby-bindings"

inherit rpm
