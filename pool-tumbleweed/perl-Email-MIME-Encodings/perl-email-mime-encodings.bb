SUMMARY = "Unified interface to MIME encoding and decoding"
DESCRIPTION = "This module simply wraps 'MIME::Base64' and 'MIME::QuotedPrint' so that you \
can throw the contents of a 'Content-Transfer-Encoding' header at some text \
and have the right thing happen. \
 \
'MIME::Base64', 'MIME::QuotedPrint', 'Email::MIME'."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.317"

RPM_NAME = "perl-Email-MIME-Encodings-1.317-1.18.noarch.rpm"
RPM_HASH = "068214fb099c526f0b5ca828972d2fde004bca7b8a188edfef08f3d07e7c8b21d7265f68edef21244bf86b8b0e13996a9f3ce90e7b0e401fca54bdc901a9a67d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Email--MIME--Encodings \
perl-Email-MIME-Encodings"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
