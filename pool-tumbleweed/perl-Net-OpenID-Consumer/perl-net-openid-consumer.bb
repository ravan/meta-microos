SUMMARY = "Library for consumers of OpenID identities"
DESCRIPTION = "This is the Perl API for (the consumer half of) OpenID, a distributed \
identity system based on proving you own a URL, which is then your \
identity. More information is available at: \
 \
  http://openid.net/"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.18"

RPM_NAME = "perl-Net-OpenID-Consumer-1.18-2.13.noarch.rpm"
RPM_HASH = "8c68dcd3eea3fe080543f412c74c1b2c59c78bd2b94dbac2816b6045918f9fe4a9a25e0b619c1f592b6a4969c3336b64343bd10ab42719784de0cd66ab08af49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--OpenID--Association \
perl-Net--OpenID--ClaimedIdentity \
perl-Net--OpenID--Consumer \
perl-Net--OpenID--VerifiedIdentity \
perl-Net-OpenID-Consumer"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Digest--SHA \
perl-HTTP--Request \
perl-JSON \
perl-LWP--UserAgent \
perl-Net--OpenID--Common \
perl-URI"

inherit rpm
