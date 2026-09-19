SUMMARY = "Check to see if your ClamAV signatures are current"
DESCRIPTION = "This check plugin is a Perl script which compares your local signature database \
(daily.cvd) version to the version advertised from the ClamAV site. It verifies \
the latest ClamAV revision using a DNS TXT query against \
current.cvd.clamav.net."
LICENSE = "ISC"

PV = "1.2"

RPM_NAME = "monitoring-plugins-clamav-1.2-1.25.noarch.rpm"
RPM_HASH = "b06225a68367927c3729dffe510fac32a60b1702a6626fd7a1f289979c64f422299e2c326d11e2a0a5a0fc8691513b1ead06ea6dace61d126c6011dc2c248bfa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "monitoring-plugins-clamav \
nagios-plugins-clamav"

RDEPENDS:${PN} += "/usr/bin/perl \
clamav \
monitoring-plugins-common \
perl-File--Basename \
perl-Net--DNS"

inherit rpm
