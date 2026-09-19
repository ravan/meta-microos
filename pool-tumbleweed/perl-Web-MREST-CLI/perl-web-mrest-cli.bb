SUMMARY = "CLI components for Web::MEST-based applications"
DESCRIPTION = "Top-level module of the Web::MREST::CLI distribution. Exports some \
'generalized' functions that are used internally and might also be useful \
for writing CLI clients in general."
LICENSE = "BSD-3-Clause"

PV = "0.284"

RPM_NAME = "perl-Web-MREST-CLI-0.284-1.20.noarch.rpm"
RPM_HASH = "40f90da38d2fb74f31981b7f44ce2e5c363e5f2fe36d4f21d02bf30d7a3d877084143b2516f134fecdaca44966c19f05ce6e5293d6b49053412a0e4f6167bd3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Web--MREST--CLI \
perl-Web--MREST--CLI--Parser \
perl-Web-MREST-CLI"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0 \
perl-App--CELL \
perl-File--HomeDir \
perl-File--ShareDir \
perl-HTTP--Request--Common \
perl-JSON \
perl-LWP--Protocol--https \
perl-LWP--UserAgent \
perl-Log--Any--Adapter \
perl-Params--Validate \
perl-Test--Deep \
perl-Try--Tiny \
perl-URI--Escape"

inherit rpm
