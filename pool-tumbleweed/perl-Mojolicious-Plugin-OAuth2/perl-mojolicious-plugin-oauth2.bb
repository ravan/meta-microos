SUMMARY = "Auth against OAuth2 APIs including OpenID Connect"
DESCRIPTION = "This Mojolicious plugin allows you to easily authenticate against a at \
http://oauth.net or at https://openid.net/connect/ provider. It includes \
configurations for a few popular providers, but you can add your own as \
well. \
 \
See register for a full list of bundled providers."
LICENSE = "Artistic-2.0"

PV = "2.02"

RPM_NAME = "perl-Mojolicious-Plugin-OAuth2-2.02-1.23.noarch.rpm"
RPM_HASH = "493cced158a962661a8b540337b119a600afe00d32025de088368a56a3a5141d85655914ae9c68862220d5726d141f24abd6fbdb62fe98c5bb90d2bb6cd4f592"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mojolicious--Plugin--OAuth2 \
perl-Mojolicious--Plugin--OAuth2--Mock \
perl-Mojolicious-Plugin-OAuth2"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-IO--Socket--SSL \
perl-Mojolicious"

inherit rpm
