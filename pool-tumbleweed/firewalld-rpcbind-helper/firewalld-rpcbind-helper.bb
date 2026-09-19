SUMMARY = "Tool for static port assignment of NFSv3, ypserv, ypbind services"
DESCRIPTION = "This is a helper utility for the configuration of static NFSv3, ypserv and \
ypbind network ports for use with firewalld."
LICENSE = "GPL-2.0-or-later"

PV = "0.21"

RPM_NAME = "firewalld-rpcbind-helper-0.21-1.18.noarch.rpm"
RPM_HASH = "85fafc288b770aeb39d8bf84b894390faf5bf48f5f40c92526558fdf080826c59cc0ee903b97322c8c0b364dfb8b33c12bd53518b36696019bb4e8cb761079f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firewalld-rpcbind-helper"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3"

inherit rpm
