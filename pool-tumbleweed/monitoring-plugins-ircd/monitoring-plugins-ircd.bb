SUMMARY = "Check an IRCd server"
DESCRIPTION = "Monitor the status of an Internet Relay Chat daemon (IRCd) with this check."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.4.0"

RPM_NAME = "monitoring-plugins-ircd-2.4.0-5.1.aarch64.rpm"
RPM_HASH = "fec882e7f395779b16308f0c7f807e9dc64c2a7b8a1b9142aa8abfe6bd406b5b06172269b8114cef939bff5aa0118f0e099bd891876a4715ca66efed5f4e1a15"

RPROVIDES:${PN} += "monitoring-plugins-ircd \
nagios-plugins-ircd"

RDEPENDS:${PN} += "/usr/bin/perl \
monitoring-plugins-common \
perl \
perl-IO--Socket--IP \
perl-IO--Socket--SSL"

inherit rpm
