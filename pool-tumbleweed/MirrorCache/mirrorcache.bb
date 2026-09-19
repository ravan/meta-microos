SUMMARY = "WebApp to redirect and manage mirrors"
DESCRIPTION = "Mirror redirector web service, which automatically scans the main server and mirrors"
LICENSE = "GPL-2.0-or-later"

PV = "1.105"

RPM_NAME = "MirrorCache-1.105-1.2.noarch.rpm"
RPM_HASH = "4bd0e8e8ca02b765a3a9122d305569649aa8bbea1936729b9cc8e26d33ced5972c248c2afe3ad3af1214c822ad82e25fb15301badff00c25cd1082b8fab1abfa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "MirrorCache \
group-mirrorcache \
user-mirrorcache"

RDEPENDS:${PN} += "/usr/bin/sh \
MirrorCache-common \
perl-CSS--Minifier--XS \
perl-CSS--Sass \
perl-IO--Socket--SSL \
perl-JavaScript--Minifier--XS \
perl-Mojolicious--Plugin--AssetPack \
perl-Mojolicious--Plugin--RenderFile \
perl-Mojolicious--Static \
perl-Net--OpenID--Consumer \
sysuser-shadow"

inherit rpm
