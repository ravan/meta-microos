SUMMARY = "URLs that refer to things on the CPAN"
DESCRIPTION = "URLs that refer to things on the CPAN"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.9.0"

RPM_NAME = "perl-URI-cpan-1.9.0-2.12.noarch.rpm"
RPM_HASH = "c9d6cec6fa41e3b7996d9ad8913c3dda4fac97541409b304adfceda1cab907162d369a1bf64e3638bcc8691f10a4b3ae4a68343df54107e8b3a53b8f19ff1618"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-URI--cpan \
perl-URI--cpan--author \
perl-URI--cpan--dist \
perl-URI--cpan--distfile \
perl-URI--cpan--module \
perl-URI--cpan--package \
perl-URI-cpan"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-CPAN--DistnameInfo \
perl-URI \
perl-parent"

inherit rpm
