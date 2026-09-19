SUMMARY = "Log4j for Perl"
DESCRIPTION = "Log::Dispatch::Config is a subclass of Log::Dispatch and provides a way to \
configure Log::Dispatch object with configulation file (default, in \
AppConfig format). I mean, this is log4j for Perl, not with all API \
compatibility though."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.04"

RPM_NAME = "perl-Log-Dispatch-Config-1.04-9.41.noarch.rpm"
RPM_HASH = "7c5895babc19105907d78a5f7cc244d2a59d47de816f08b9b76189c8b7ae60accb96e055a1e12e62768d115d92eef06d424171d956083b9df7201231fb8bd572"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Log--Dispatch--Config \
perl-Log--Dispatch--Configurator \
perl-Log--Dispatch--Configurator--AppConfig \
perl-Log-Dispatch-Config"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-AppConfig \
perl-File--Temp \
perl-IO--Scalar \
perl-Log--Dispatch \
perl-Test--More"

inherit rpm
