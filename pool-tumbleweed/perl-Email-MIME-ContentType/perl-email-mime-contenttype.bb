SUMMARY = "Parse and build a MIME Content-Type or Content-Disposition Header"
DESCRIPTION = "Parse and build a MIME Content-Type or Content-Disposition Header"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.028"

RPM_NAME = "perl-Email-MIME-ContentType-1.028-1.17.noarch.rpm"
RPM_HASH = "ee03de279ce34c8d410e8d16025b798561c579cc418aad932d0bfee46b37c3ee0f5b5287bf7849ac2690edb663bb639362e87d46f6106e33bdd885f8293be22a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Email--MIME--ContentType \
perl-Email-MIME-ContentType"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Encode \
perl-Text--Unidecode"

inherit rpm
