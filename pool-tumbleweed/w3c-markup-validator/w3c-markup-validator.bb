SUMMARY = "W3C Markup Validator"
DESCRIPTION = "The W3C Markup Validator checks documents like HTML and XHTML for \
conformance to W3C Recommendations and other standards."
LICENSE = "W3C"

PV = "1.3"

RPM_NAME = "w3c-markup-validator-1.3-12.7.noarch.rpm"
RPM_HASH = "eff9cde8fdb105e2863f1c050d39ad243a3ca9eefc7a75621a1a160c4fcb1f7e1276ba875c7902b7805b3a5973562f239457725388f4875d4b36a9f51c777110"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-w3c-markup-validator \
w3c-markup-validator"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
apache2 \
opensp \
perl-CGI \
perl-Class--Accessor \
perl-Config--General \
perl-Encode--HanExtra \
perl-Encode--JIS2K \
perl-File--Spec--Functions \
perl-HTML--Encoding \
perl-HTML--Parser \
perl-HTML--Template \
perl-HTML--Tidy \
perl-LWP--UserAgent \
perl-Net--IP \
perl-Net--hostent \
perl-SGML--Parser--OpenSP \
perl-String--Approx \
perl-URI \
perl-XML--LibXML \
w3c-markup-validator-libs"

inherit rpm
