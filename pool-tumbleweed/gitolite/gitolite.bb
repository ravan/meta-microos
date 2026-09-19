SUMMARY = "Server for git directory version tracker"
DESCRIPTION = "Gitolite is an access control layer on top of git, which allows access control \
down to the branch level, including specifying who can and cannot rewind a given \
branch."
LICENSE = "GPL-2.0-or-later"

PV = "3.6.15"

RPM_NAME = "gitolite-3.6.15-1.1.noarch.rpm"
RPM_HASH = "93eadbe648b9d1265979938b32c1eef870fcd5184f9f1266d75c067d80bc6dd143886d9078ca4eb50a8a2b7ed8d9cd9443c53ae07acabe2903b3e701d1bbb1d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-gitolite \
gitolite \
group-git \
perl-Gitolite--Cache \
perl-Gitolite--Common \
perl-Gitolite--Conf \
perl-Gitolite--Conf--Explode \
perl-Gitolite--Conf--Load \
perl-Gitolite--Conf--Store \
perl-Gitolite--Conf--Sugar \
perl-Gitolite--Easy \
perl-Gitolite--Hooks--PostUpdate \
perl-Gitolite--Hooks--Update \
perl-Gitolite--Rc \
perl-Gitolite--Setup \
perl-Gitolite--Test \
perl-Gitolite--Triggers \
perl-Gitolite--Triggers--Alias \
perl-Gitolite--Triggers--AutoCreate \
perl-Gitolite--Triggers--CpuTime \
perl-Gitolite--Triggers--Kindergarten \
perl-Gitolite--Triggers--Mirroring \
perl-Gitolite--Triggers--Motd \
perl-Gitolite--Triggers--RefexExpr \
perl-Gitolite--Triggers--RepoUmask \
perl-Gitolite--Triggers--Shell \
perl-Gitolite--Triggers--TProxy \
perl-Gitolite--Triggers--Writable \
perl-SugarBox \
perl-Tsh \
user-git"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
git \
perl--MODULE-COMPAT-5.44.0 \
user-nginx \
user-wwwrun"

inherit rpm
