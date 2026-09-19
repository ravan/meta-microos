SUMMARY = "Perl support scripts for the Warewulf3 system"
DESCRIPTION = "Warewulf is a scalable systems management suite originally developed to \
manage large high-performance Linux clusters. Focused on general \
scalable system management, it includes a framework for system \
configuration, management, provisioning/installation, monitoring, event \
notification, and more via a modular plugin architecture. \
 \
This package includes the supporting libs for the Warewulf daemon."
LICENSE = "BSD-3-Clause-LBNL"

PV = "3.8.1"

RPM_NAME = "perl-warewulf-common-3.8.1-14.10.noarch.rpm"
RPM_HASH = "627cf6df3442e1a24d29a859f8b735ad29ef5809a91c09d7d62f19edb01b4d619399d82e06dbda09eb695403183df6aa6ca9987ac53a06b46d9b5b538f6de885"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-perl-warewulf-common \
group-warewulf \
perl-Warewulf--ACVars \
perl-Warewulf--Config \
perl-Warewulf--DSO \
perl-Warewulf--DSO--Config \
perl-Warewulf--DSO--File \
perl-Warewulf--DSO--Node \
perl-Warewulf--Daemon \
perl-Warewulf--DataStore \
perl-Warewulf--DataStore--SQL \
perl-Warewulf--DataStore--SQL--BaseClass \
perl-Warewulf--DataStore--SQL--MySQL \
perl-Warewulf--DataStore--SQL--PostgreSQL \
perl-Warewulf--DataStore--SQL--SQLite \
perl-Warewulf--Event \
perl-Warewulf--Event--DefaultNode \
perl-Warewulf--Event--NewObject \
perl-Warewulf--Event--UniqueNode \
perl-Warewulf--EventHandler \
perl-Warewulf--File \
perl-Warewulf--Init \
perl-Warewulf--Logger \
perl-Warewulf--Master \
perl-Warewulf--Module \
perl-Warewulf--Module--Cli \
perl-Warewulf--Module--Cli--Events \
perl-Warewulf--Module--Cli--Exit \
perl-Warewulf--Module--Cli--File \
perl-Warewulf--Module--Cli--Help \
perl-Warewulf--Module--Cli--Node \
perl-Warewulf--Module--Cli--Object \
perl-Warewulf--Module--Cli--Output \
perl-Warewulf--Module--Cli--Quit \
perl-Warewulf--Module--Trigger \
perl-Warewulf--ModuleLoader \
perl-Warewulf--Network \
perl-Warewulf--Node \
perl-Warewulf--Object \
perl-Warewulf--ObjectSet \
perl-Warewulf--ParallelCmd \
perl-Warewulf--RetVal \
perl-Warewulf--System \
perl-Warewulf--System--Deb \
perl-Warewulf--System--Rhel \
perl-Warewulf--System--Suse \
perl-Warewulf--SystemFactory \
perl-Warewulf--Term \
perl-Warewulf--Timer \
perl-Warewulf--Util \
perl-warewulf-common"

RDEPENDS:${PN} += "/usr/bin/sh \
perl--MODULE-COMPAT-5.44.0 \
perl-DBD-mysql \
sysuser-shadow"

inherit rpm
