SUMMARY = "Simplified interface to Log::Message"
DESCRIPTION = "This module provides standardized logging facilities using the \
'Log::Message' module."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.10"

RPM_NAME = "perl-Log-Message-Simple-0.10-3.42.noarch.rpm"
RPM_HASH = "ccc5bd11552256c8a322b1e93ea63d7f2c4c3b23a919f1ef9a80eae3a82e85a3d30a2a47b62e8c762e45fb281bfc293c4ac3a035c1f9c7c4cb51990eb86d5da8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Log--Message--Simple \
perl-Log-Message-Simple"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Log--Message"

inherit rpm
