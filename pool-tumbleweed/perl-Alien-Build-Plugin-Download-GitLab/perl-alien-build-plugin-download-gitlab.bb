SUMMARY = "Alien::Build plugin to download from GitLab"
DESCRIPTION = "This plugin is designed for downloading assets from a GitLab instance."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.10.0"

RPM_NAME = "perl-Alien-Build-Plugin-Download-GitLab-0.10.0-1.10.noarch.rpm"
RPM_HASH = "c32f8eccdd69e55dcf9333cea718f9aac4c97883fc467d9e1ad397cb85c7d9f3e3f5382ef85e6f0611f92f58d3163c1cd2a0303d8eef8c9c4af0e0de3c91c1ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Alien--Build--Plugin--Download--GitLab \
perl-Alien-Build-Plugin-Download-GitLab"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Alien--Build--Plugin \
perl-JSON--PP \
perl-Path--Tiny \
perl-URI \
perl-URI--Escape"

inherit rpm
