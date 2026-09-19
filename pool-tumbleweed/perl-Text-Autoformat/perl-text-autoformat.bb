SUMMARY = "Automatic text wrapping and reformatting"
DESCRIPTION = "Automatic text wrapping and reformatting"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.75"

RPM_NAME = "perl-Text-Autoformat-1.75-1.31.noarch.rpm"
RPM_HASH = "24e283da617f4527cabf96330966020fa3d9dc8defc34c674540e95d114e2e079236cdf34fea95d4365df5f6ef0ae253d761d90d9715cafed651d7f813485a78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Text--Autoformat \
perl-Text--Autoformat--Hang \
perl-Text--Autoformat--NullHang \
perl-Text-Autoformat"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Text--Reform"

inherit rpm
