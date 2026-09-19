SUMMARY = "Zypper subcommand for lifecycle information"
DESCRIPTION = "Zypper subcommand for products and packages lifecycle information."
LICENSE = "GPL-2.0"

PV = "0.6.1601367426.843fe7a"

RPM_NAME = "zypper-lifecycle-plugin-0.6.1601367426.843fe7a-5.1.noarch.rpm"
RPM_HASH = "069eeeaa5c8eb0e8a1e0945e2836fdab687785602210be4c58970c55fb6135be33003c8a658c3e642fb2fdcea88d5ae25ab03f679e1ae9332c0e4013fa7e8721"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zypper-lifecycle-plugin"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby4.0 \
/usr/bin/sh \
systemd \
zypper"

inherit rpm
