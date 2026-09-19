SUMMARY = "Get number of occupied columns of a string on terminal"
DESCRIPTION = "Get number of occupied columns of a string on terminal \
 \
 \
 \
Authors: \
-------- \
    &#20037;&#20445;&#30000; &#26234;&#24195; (Tomohiro KUBOTA) <kubota@debian.org>"
LICENSE = "Artistic-1.0"

PV = "0.04"

RPM_NAME = "perl-Text-CharWidth-0.04-100.55.aarch64.rpm"
RPM_HASH = "2f691a577f219018896f04efc6321b8599fde26ba5ed50935011798663b4d7feaa35e31d0f5da48855af7841e8707deea842b4515aef5e33be953db31ae71652"

RPROVIDES:${PN} += "perl-Text--CharWidth \
perl-Text-CharWidth"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
