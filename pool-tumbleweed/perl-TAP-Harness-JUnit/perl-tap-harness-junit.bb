SUMMARY = "Generate JUnit compatible output from TAP results"
DESCRIPTION = "The only difference between this module and _TAP::Harness_ is that this \
module adds the optional arguments 'xmlfile', 'package', and 'namemangle' \
that cause the output to be formatted into XML in a format similar to the \
one that is produced by the JUnit testing framework."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.42"

RPM_NAME = "perl-TAP-Harness-JUnit-0.42-1.31.noarch.rpm"
RPM_HASH = "84c0e974a18793f1000474c75f66166465491fa097f6d358a7a1031625a116e1aaf809ea7d322840d63be3e0846852350a985b740784675e42dbf9579c92e80c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-TAP--Harness--JUnit \
perl-TAP--Harness--JUnit--Parser \
perl-TAP-Harness-JUnit"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-TAP--Harness \
perl-TAP--Parser \
perl-XML--Simple"

inherit rpm
