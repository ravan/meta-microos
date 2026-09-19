SUMMARY = "Libraries shared between Net::OpenID::Consumer and Net::OpenID::Server"
DESCRIPTION = "The Consumer and Server implementations share a few libraries which live \
with this module. This module is here largely to hold the version number \
and this documentation, though it also incorporates some utility functions \
inherited from previous versions of Net::OpenID::Consumer."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.20"

RPM_NAME = "perl-Net-OpenID-Common-1.20-1.41.noarch.rpm"
RPM_HASH = "321f54afdb80085e5102a9cd5f7b32bb01b5ea3734afa2bd1b6a22457318f56538a812b2e3339300a1a7ebfee039468c2c50796a5da3bf0b7ca4f6e92a1eeccd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--OpenID--Common \
perl-Net--OpenID--Extension \
perl-Net--OpenID--Extension--SimpleRegistration \
perl-Net--OpenID--Extension--SimpleRegistration--Request \
perl-Net--OpenID--Extension--SimpleRegistration--Response \
perl-Net--OpenID--ExtensionMessage \
perl-Net--OpenID--IndirectMessage \
perl-Net--OpenID--URIFetch \
perl-Net--OpenID--URIFetch--Response \
perl-Net--OpenID--Yadis \
perl-Net--OpenID--Yadis--Service \
perl-Net-OpenID-Common \
perl-OpenID--util"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Crypt--DH--GMP \
perl-HTML--Parser \
perl-HTTP--Headers--Util \
perl-HTTP--Message \
perl-HTTP--Request \
perl-HTTP--Status \
perl-XML--Simple"

inherit rpm
