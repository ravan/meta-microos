SUMMARY = "Log to Files that Archive/Rotate Themselves"
DESCRIPTION = "This module extends the base class Log::Dispatch::Output to provides a \
simple object for logging to files under the Log::Dispatch::* system, and \
automatically rotating them according to different constraints. This is \
basically a Log::Dispatch::File wrapper with additions."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.38"

RPM_NAME = "perl-Log-Dispatch-FileRotate-1.38-1.25.noarch.rpm"
RPM_HASH = "c4e067918e82a8489c4164f602fd67b37abede7922a1c1cb0007a8c83cd633c1ab1bb16001215fb422416f58488744514949f71944a81a3ae788602f59b8d11a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Log--Dispatch--FileRotate \
perl-Log--Dispatch--FileRotate--Flock \
perl-Log--Dispatch--FileRotate--Mutex \
perl-Log-Dispatch-FileRotate"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Date--Manip \
perl-Log--Dispatch \
perl-Log--Dispatch--File \
perl-Log--Dispatch--Output \
perl-version"

inherit rpm
