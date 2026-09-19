SUMMARY = "Load URI::Escape::XS preferentially over URI::Escape"
DESCRIPTION = "URI::Escape is great, but URI::Escape::XS is faster. This module loads \
URI::Escape::XS and imports the two most common methods if XS is installed. \
 \
The insides of this module aren't completely shaken out yet, so patches \
welcome."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.10.0"

RPM_NAME = "perl-Any-URI-Escape-0.10.0-1.9.noarch.rpm"
RPM_HASH = "9c6e71a919014ca5b5d573ca461ebad05e41fda7c0c06f839d0e29398f660730296a80ccad01dd815fb9bb6b7e3098d3db7d5b58c9e0e68826d6e86519d70df3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Any--URI--Escape \
perl-Any-URI-Escape"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-URI--Escape"

inherit rpm
