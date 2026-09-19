SUMMARY = "Command line tool to unpack anything"
DESCRIPTION = "/usr/bin/file-unpack is a trivial command line frontend that \
ships with the File::Unpack perl module."
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PV = "0.70"

RPM_NAME = "file-unpack-0.70-8.14.aarch64.rpm"
RPM_HASH = "38655093981d1b2764cc0655f56739e9c09cbc286645463f8f6d483592914553e337b7906568ec7cb6a92c659c12fb606871c69b96a155f3987e89af70158ddb"

RPROVIDES:${PN} += "file-unpack"

RDEPENDS:${PN} += "/usr/bin/perl \
libc.so.6 \
perl-File--Unpack"

inherit rpm
