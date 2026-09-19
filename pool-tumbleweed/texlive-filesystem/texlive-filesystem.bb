SUMMARY = "Basic file system of TeX Live"
DESCRIPTION = "The basic file system layout for TeX Live installation."
LICENSE = "Apache-2.0 & Artistic-1.0 & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & LPPL-1.3c & LPPL-1.0 & MIT & BSD-3-Clause & SUSE-TeX & LicenseRef-SUSE-Public-Domain"

PV = "2026.222"

RPM_NAME = "texlive-filesystem-2026.222-68.2.noarch.rpm"
RPM_HASH = "a56b1f08f6cc75d3808d033d405738f9ee437d03df7afc199da8278e2a9b6b7bf31cc39bc8b1a047559543b1388403704f50d5815c2afdb048c28185227a732b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-filesystem \
texlive-filesystem"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/clear \
/usr/bin/dialog \
/usr/bin/mkdir \
/usr/bin/mktemp \
/usr/bin/mv \
/usr/bin/perl \
/usr/bin/sh \
/usr/bin/stat \
/usr/bin/touch \
coreutils \
ed \
fillup \
findutils \
grep \
group-mktex \
permissions \
pkgconfig-systemd \
python3 \
rpm-macro--unitdir \
rpm-macro-service-add-post \
rpm-macro-service-add-pre \
rpm-macro-service-del-postun \
rpm-macro-service-del-preun \
sed \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
user-mktex \
util-linux"

inherit rpm
