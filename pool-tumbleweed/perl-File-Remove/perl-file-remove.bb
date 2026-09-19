SUMMARY = "Remove files and directories"
DESCRIPTION = "*File::Remove::remove* removes files and directories. It acts like \
*/bin/rm*, for the most part. Although 'unlink' can be given a list of \
files, it will not remove directories; this module remedies that. It also \
accepts wildcards, * and ?, as arguments for filenames. \
 \
*File::Remove::trash* accepts the same arguments as *remove*, with the \
addition of an optional, infrequently used 'other platforms' hashref."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.61"

RPM_NAME = "perl-File-Remove-1.61-1.20.noarch.rpm"
RPM_HASH = "f0953dc78d95502496c6b032041c196b2037ac5634c142a43141d495cec5d8791e12a88ddfe9b9965d71fc8e4e6f99fa8978f3fc9db18f646613c0d39f8c8c05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--Remove \
perl-File-Remove"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Cwd \
perl-File--Spec"

inherit rpm
