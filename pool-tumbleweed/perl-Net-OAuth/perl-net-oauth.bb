SUMMARY = "OAuth 1.0 for Perl"
DESCRIPTION = "OAuth 1.0 for Perl"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.330.0"

RPM_NAME = "perl-Net-OAuth-0.330.0-1.1.noarch.rpm"
RPM_HASH = "2014a87d16cc3f5721dfe84051a1290b0f4778be703c8a75f8ef64bbac84f34f1cfd4d84e85905b36242f37f53f4cb852c03d3ff9d68f607526ba40728f15194"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--OAuth \
perl-Net--OAuth--AccessToken \
perl-Net--OAuth--AccessTokenRequest \
perl-Net--OAuth--AccessTokenResponse \
perl-Net--OAuth--Client \
perl-Net--OAuth--ConsumerRequest \
perl-Net--OAuth--Message \
perl-Net--OAuth--ProtectedResourceRequest \
perl-Net--OAuth--Request \
perl-Net--OAuth--RequestTokenRequest \
perl-Net--OAuth--RequestTokenResponse \
perl-Net--OAuth--Response \
perl-Net--OAuth--SignatureMethod \
perl-Net--OAuth--SignatureMethod--HMAC-SHA1 \
perl-Net--OAuth--SignatureMethod--HMAC-SHA256 \
perl-Net--OAuth--SignatureMethod--PLAINTEXT \
perl-Net--OAuth--SignatureMethod--RSA-SHA1 \
perl-Net--OAuth--UserAuthRequest \
perl-Net--OAuth--UserAuthResponse \
perl-Net--OAuth--V1-0A--AccessTokenRequest \
perl-Net--OAuth--V1-0A--RequestTokenRequest \
perl-Net--OAuth--V1-0A--RequestTokenResponse \
perl-Net--OAuth--V1-0A--UserAuthResponse \
perl-Net--OAuth--XauthAccessTokenRequest \
perl-Net--OAuth--YahooAccessTokenRefreshRequest \
perl-Net-OAuth"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Class--Accessor \
perl-Class--Data--Inheritable \
perl-Crypt--SysRandom \
perl-Digest--SHA \
perl-Encode \
perl-LWP--UserAgent \
perl-Test--More \
perl-Test--Warn \
perl-URI"

inherit rpm
