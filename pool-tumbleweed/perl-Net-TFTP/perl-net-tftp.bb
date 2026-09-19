SUMMARY = "TFTP Client class"
DESCRIPTION = "'Net::TFTP' is a class implementing a simple _Trivial File Transfer \
Protocol_ client in Perl as described in RFC1350. 'Net::TFTP' also supports \
the TFTP Option Extension (as described in RFC2347), with the following \
options \
 \
 RFC2348 Blocksize Option"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.1901"

RPM_NAME = "perl-Net-TFTP-0.1901-1.39.noarch.rpm"
RPM_HASH = "9f712a7acaa45f462b82855349330ccd66d14ef9d4832e1b9efa132ec3377780b277452743f84b294d14a74fda19ad5aca3ec8f06f0bf8641e49f7646d39eb81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--TFTP \
perl-Net--TFTP--IO \
perl-Net-TFTP"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Test--MockModule \
perl-Test--More \
perl-Test--Warn"

inherit rpm
