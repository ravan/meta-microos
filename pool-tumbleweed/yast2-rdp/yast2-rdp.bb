SUMMARY = "Setup Remote Desktop Protocol service for remote administration"
DESCRIPTION = "Configure RDP (remote desktop protocol) daemon to allow remote system administration."
LICENSE = "GPL-2.0-only"

PV = "5.0.1"

RPM_NAME = "yast2-rdp-5.0.1-1.2.noarch.rpm"
RPM_HASH = "9ac7f779142111e7194357fc4d0fffeb4f0a7f8be2dd4d49f05164b87dc616fb7c838928e0913f9c8b75563b015d6f10f660a8151b0a077c723d6e29c826e678"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-rdp"

RDEPENDS:${PN} += "yast2 \
yast2-ruby-bindings"

inherit rpm
