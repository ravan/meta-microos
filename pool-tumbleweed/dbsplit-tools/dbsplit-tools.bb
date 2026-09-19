SUMMARY = "DocBook Splitting tools"
DESCRIPTION = "Tools for splitting and merging DocBook documents,"
LICENSE = "GPL-2.0-or-later"

PV = "0.6"

RPM_NAME = "dbsplit-tools-0.6-141.17.noarch.rpm"
RPM_HASH = "0968b82b620b9269d1a412de9cd31ba482da0f7a594e5c976d79aec59cdd8f3c68ae86838cc4256f9ab56cc47ccc17972d9f34fc57270c3a0af72756a8810c5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dbsplit-tools"

RDEPENDS:${PN} += "/usr/bin/perl \
perl-XML-DOM \
perl-XML-RegExp"

inherit rpm
