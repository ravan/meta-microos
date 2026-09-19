SUMMARY = "determine file type using magic"
DESCRIPTION = "File::Type uses magic numbers (typically at the start of a file) to \
determine the MIME type of that file. \
 \
 \
 \
Authors: \
-------- \
    Paul Mison <pmison at fotango dot com>"
LICENSE = "Artistic-1.0"

PV = "0.22"

RPM_NAME = "perl-File-Type-0.22-163.46.aarch64.rpm"
RPM_HASH = "734060d3f58068770cdf52fae705f422653cc9b8505b6bb9318ff21a9f13a91bd7c168f479b23c05ccd66547643396156f4f5a06c799b81340c8d41e72b85fc6"

RPROVIDES:${PN} += "perl-File--Type \
perl-File--Type--Builder \
perl-File-Type"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
