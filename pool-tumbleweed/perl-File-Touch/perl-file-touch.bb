SUMMARY = "Update file access and modification times, optionally creating files if needed"
DESCRIPTION = "This module provides both a functional and OO interface for changing the \
file access and modification times on files. It can optionally create the \
file for you, if it doesn't exist. \
 \
*Note*: you should specify a minimum version of 0.12, as per the SYNOPSIS, \
as that fixed an issue that affected systems that have sub-second \
granularity on those file times. \
 \
Here's a list of arguments that can be used with the object-oriented \
contruction: \
 \
* atime_only => [0|1] \
 \
If nonzero, change only the access time of files. Default is zero. \
 \
* mtime_only => [0|1] \
 \
If nonzero, change only the modification time of files. Default is zero. \
 \
* no_create => [0|1] \
 \
If nonzero, do not create new files. Default is zero. \
 \
* reference => $reference_file \
 \
If defined, use timestamps from this file instead of current time. The \
timestamps are read from the reference file when the object is created, not \
when '<-'touch>> is invoked. Default is undefined. \
 \
* time => $time \
 \
If defined, then this value will be used for both access time and \
modification time, whichever of those are set. This time is overridden by \
the 'atime' and 'mtime' arguments, if you use them. \
 \
* atime => $time \
 \
If defined, use this time (in epoch seconds) instead of current time for \
access time. \
 \
* mtime => $time \
 \
If defined, use this time (in epoch seconds) instead of current time for \
modification time."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.12"

RPM_NAME = "perl-File-Touch-0.12-1.26.noarch.rpm"
RPM_HASH = "bfaf6462a6b7c2f0230f0bdcfb96e944e959c595de2960f05ca9186396cc7d0df979166058fc609426cce21a6c77762616a8f34ddb9d7708973c03f5af2481c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--Touch \
perl-File-Touch"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Time--HiRes"

inherit rpm
