SUMMARY = "A simple object base class."
DESCRIPTION = "the Rose::Object manpage is a generic object base class. It provides very \
little functionality, but a healthy dose of convention."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.860"

RPM_NAME = "perl-Rose-Object-0.860-1.42.noarch.rpm"
RPM_HASH = "95d01948520c553dfd6aaa06ccc0d1e9f24b990bc49e9c6f84f95e2e239d0c5a4e83161a97ea98841881f0068384113b509e2c1f2279eef4f52a5e25b6c1ccad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Rose--Class \
perl-Rose--Class--MakeMethods--Generic \
perl-Rose--Class--MakeMethods--Set \
perl-Rose--Object \
perl-Rose--Object--MakeMethods \
perl-Rose--Object--MakeMethods--DateTime \
perl-Rose--Object--MakeMethods--Generic \
perl-Rose--Object--MixIn \
perl-Rose-Object"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
