SUMMARY = "Simple perl utility emulating zypper download"
DESCRIPTION = "Investigate and benchmark various package download strategies"
LICENSE = "GPL-2.0-or-later"

PV = "0.08"

RPM_NAME = "sypper-0.08-1.10.noarch.rpm"
RPM_HASH = "f3309a216f928d0f56d57c6eabf3a88965d5c479b91ff1f35b74e64d3ffb7a5a2a95815ef03f4e7fe9d9a222b872cab6cc690426d3f9f7cac06d7a602be5baab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Sypp \
perl-Sypp--Repo \
perl-Sypp--Repo--Rpm \
perl-Sypp--Repo--System \
perl-SyppApp \
perl-SyppApp--Command \
perl-SyppApp--Command--download \
perl-SyppApp--Command--install \
perl-SyppApp--Command--refresh \
perl-SyppApp--Config \
perl-SyppApp--Plugin--Repos \
perl-SyppWeb \
perl-SyppWeb--Controller--Rest--Repo \
sypper"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
perl--MODULE-COMPAT-5.44.0 \
perl-Config-IniFiles \
perl-IO-Socket-SSL \
perl-Mojolicious \
perl-base \
perl-solv"

inherit rpm
