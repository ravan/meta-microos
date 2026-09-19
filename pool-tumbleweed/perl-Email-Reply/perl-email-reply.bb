SUMMARY = "Reply to an Email Message"
DESCRIPTION = "This software takes the hard out of generating replies to email messages."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.204"

RPM_NAME = "perl-Email-Reply-1.204-1.36.noarch.rpm"
RPM_HASH = "0ffed5c99c82ecc198c1dec1b7c5d8a26557e7e289fb869e8b05fbc9a8faff67ae86f7800dab9cd5c12073b46adc656ffb481fe91f10039fafcd2756b0b00586"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Email--Reply \
perl-Email-Reply"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Email--Abstract \
perl-Email--Address \
perl-Email--MIME"

inherit rpm
