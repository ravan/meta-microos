SUMMARY = "Performance Co-Pilot Perl bindings for processing pmlogsummary output"
DESCRIPTION = "The PCP::LogSummary module provides a Perl module for using the \
statistical summary data produced by the Performance Co-Pilot \
pmlogsummary utility.  This utility produces various averages, \
minima, maxima, and other calculations based on the performance \
data stored in a PCP archive.  The Perl interface is ideal for \
exporting this data into third-party tools (e.g. spreadsheets)."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "perl-PCP-LogSummary-6.3.8-3.1.aarch64.rpm"
RPM_HASH = "c40cfcdfa65108a6f2b4e7e093c5e96c8e309e39745063b1408c8f3b3d64c31da771f34d83b0bbd8a70b53798d93ba69dc2b27d772176124f36595fb182f0f26"

RPROVIDES:${PN} += "perl-PCP--LogSummary \
perl-PCP-LogSummary"

RDEPENDS:${PN} += "/usr/bin/perl \
libpcp3 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
