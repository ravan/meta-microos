SUMMARY = "Command line tool to unpack anything"
DESCRIPTION = "/usr/bin/file-unpack2 is a trivial command line frontend that \
ships with the File::Unpack2 perl module."
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PV = "1.0"

RPM_NAME = "file-unpack2-1.0-1.16.aarch64.rpm"
RPM_HASH = "6cc8ca57afe7d7ce2b96043db0bec18eda308ac3a34e87483a9109053a204b86dd2b0bcb580097833c490d626f41f8f7c6497a55eaa3da7093203e0382ef30f1"

RPROVIDES:${PN} += "file-unpack2"

RDEPENDS:${PN} += "/usr/bin/env \
libc.so.6 \
perl-File--Unpack2"

inherit rpm
