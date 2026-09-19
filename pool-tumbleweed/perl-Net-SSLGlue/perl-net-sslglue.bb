SUMMARY = "Add/Extend Ssl Support for Common Perl Modules"
DESCRIPTION = "Some commonly used perl modules don't have SSL support at all, even if the \
protocol supports it. Others have SSL support, but most of them don't do \
proper checking of the server's certificate. \
 \
The 'Net::SSLGlue::*' modules try to add SSL support or proper certificate \
checking to these modules. Currently support for the following modules is \
available: \
 \
* Net::SMTP - add SSL from beginning or using STARTTLS \
 \
* Net::POP3 - add SSL from beginning or using STLS \
 \
* Net::FTP  - add SSL and IPv6 support to Net::FTP \
 \
* Net::LDAP - add proper certificate checking \
 \
* LWP - add proper certificate checking for older LWP versions \
 \
There is also a Net::SSLGlue::Socket package which combines ssl and non-ssl \
and ipv6 capabilities to make it easier to enhance modules based on \
IO::Socket::INET."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.058"

RPM_NAME = "perl-Net-SSLGlue-1.058-1.39.noarch.rpm"
RPM_HASH = "9c266a5e7c8c49259e1c7910f644cfd2dcbb129e7814a6690a957d7b89cc9828478986d66780d1c5f14893e713f04fd8bf6f4555a2a1b7cbd74619e5034971eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--SSLGlue \
perl-Net--SSLGlue--FTP \
perl-Net--SSLGlue--FTP--SingleSessionCache \
perl-Net--SSLGlue--LDAP \
perl-Net--SSLGlue--LWP \
perl-Net--SSLGlue--LWP--Socket \
perl-Net--SSLGlue--POP3 \
perl-Net--SSLGlue--POP3---SSL-Socket \
perl-Net--SSLGlue--POP3---SSLified \
perl-Net--SSLGlue--SMTP \
perl-Net--SSLGlue--SMTP---SSL-Socket \
perl-Net--SSLGlue--SMTP---SSLified \
perl-Net--SSLGlue--Socket \
perl-Net--SSLGlue--Socket--HANDLE \
perl-Net-SSLGlue"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-IO--Socket--SSL"

inherit rpm
