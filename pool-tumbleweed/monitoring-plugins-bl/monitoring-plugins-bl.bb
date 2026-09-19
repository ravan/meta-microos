SUMMARY = "Check anti-spam blocklists for given server"
DESCRIPTION = "This monitoring plugin will check whether the specified server is in any of the \
numerous anti-spam blocklists."
LICENSE = "GPL-2.0+"

PV = "1.0"

RPM_NAME = "monitoring-plugins-bl-1.0-101.23.noarch.rpm"
RPM_HASH = "997d427d344bdc64458a58a0daa29a7b4237ace8b9ea2839690f8e3d99d1644f1b882cc97327f2a13892d1f6d5486dbc7edb3809386b93c20930fe3078027698"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "monitoring-plugins-bl \
nagios-plugins-bl"

RDEPENDS:${PN} += "/usr/bin/perl \
perl-Net--DNS"

inherit rpm
