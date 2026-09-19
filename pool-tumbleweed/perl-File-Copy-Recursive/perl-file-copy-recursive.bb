SUMMARY = "Perl extension for recursively copying files and directories"
DESCRIPTION = "This module copies and moves directories recursively (or single files, \
well... singley) to an optional depth and attempts to preserve each file or \
directory's mode."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.450.0"

RPM_NAME = "perl-File-Copy-Recursive-0.450.0-1.7.noarch.rpm"
RPM_HASH = "dec86590f4c992e556dc170cb19ff5e0f996a2769e0796ae2222c6494d078284392c37a94131c8fdca56bf23b2259b2bb19b5b912549c010d2838e83df12f33e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--Copy--Recursive \
perl-File-Copy-Recursive"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
