SUMMARY = "Check a remote tftp server"
DESCRIPTION = "This plugin checks for availability of a TFTP Server, \
which is normaly used for booting clients over the network. \
 \
It downloads a test file from the TFTP server and checks its size against a \
given value."
LICENSE = "GPL-2.0+"

PV = "0.11"

RPM_NAME = "monitoring-plugins-tftp-0.11-100.24.noarch.rpm"
RPM_HASH = "18a7397f49e1771e97aa0343bc2a1f9384724039eb611e88035a5aac2d6a7b5373677cab2a0c89663e94954502e1116a73a1a910f014d130084e3c9428eb65d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "monitoring-plugins-tftp \
nagios-plugins-tftp"

RDEPENDS:${PN} += "/usr/bin/perl \
perl-FileHandle \
perl-Net--TFTP"

inherit rpm
