SUMMARY = "A scalable, open extension to CGI"
DESCRIPTION = "FastCGI is a language independent, scalable, open extension to CGI that \
provides high performance without the limitations of server specific \
APIs."
LICENSE = "OML"

PV = "2.4.7"

RPM_NAME = "perl-FCGI-2.4.7-1.7.aarch64.rpm"
RPM_HASH = "c2a7ddccb0b9b9e53a6200c782f044775a20a4c757e39f2f01f75f6e0d5a4d84e13124ab074ec9d3a4f291a1072da504198bdc3651846e303c9621f30c8584f6"

RPROVIDES:${PN} += "perl-FCGI \
perl-FCGI--Stream \
perl-FastCGI"

RDEPENDS:${PN} += "FastCGI \
ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
