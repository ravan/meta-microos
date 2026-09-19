SUMMARY = "Use CHI Caches in Mojolicious"
DESCRIPTION = "Mojolicious::Plugin::CHI is a simple plugin to work with CHI caches within \
Mojolicious."
LICENSE = "Artistic-2.0"

PV = "0.20"

RPM_NAME = "perl-Mojolicious-Plugin-CHI-0.20-1.33.noarch.rpm"
RPM_HASH = "5cfb66977188ed8251e819322a806891352e617fc1fa8cb7988f100813010a9b7db23492059f19c0aa6191fe447c8d749e5af09465be575179f8fd9d01a7e65f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mojolicious--Plugin--CHI \
perl-Mojolicious--Plugin--CHI--chi \
perl-Mojolicious-Plugin-CHI"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-CHI \
perl-Digest--JHash \
perl-Mojolicious"

inherit rpm
