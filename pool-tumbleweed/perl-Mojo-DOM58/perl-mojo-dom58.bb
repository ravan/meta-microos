SUMMARY = "Minimalistic HTML/XML DOM parser with CSS selectors"
DESCRIPTION = "Mojo::DOM58 is a minimalistic and relaxed pure-perl HTML/XML DOM parser \
based on Mojo::DOM. It supports the at https://html.spec.whatwg.org/ and at \
https://www.w3.org/TR/xml/, and matching based on at \
https://www.w3.org/TR/selectors/. It will even try to interpret broken HTML \
and XML, so you should not use it for validation."
LICENSE = "Artistic-2.0"

PV = "3.2.0"

RPM_NAME = "perl-Mojo-DOM58-3.2.0-1.7.noarch.rpm"
RPM_HASH = "36f9472cc4a2ca0a23951a92d659e2901b8f5cac0c53cb5d5760bedad7346e71189aa6c1f80877163fb9abd4727a78440c041670cab3b9f09ef98da65b71f284"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mojo--DOM58 \
perl-Mojo--DOM58--Entities \
perl-Mojo-DOM58"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
