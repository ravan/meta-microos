SUMMARY = "The openQA common tools for web-frontend and workers"
DESCRIPTION = "This package contain shared resources for openQA web-frontend and \
openQA workers."
LICENSE = "GPL-2.0-or-later"

PV = "5.1788605562.29b45941"

RPM_NAME = "openQA-common-5.1788605562.29b45941-1.1.aarch64.rpm"
RPM_HASH = "d8b668861525ea143ab212548837d3b0acb0b3cf38c537921185d8fa1141a45202af0d57b4743fdf7a8ab3c098d0cb492cb588158ea2e0834dcc38360e8d805a"

RPROVIDES:${PN} += "openQA-common \
perl-Mojolicious--Plugin--AssetPack--Pipe--FetchForNode \
perl-OpenQA \
perl-OpenQA--App \
perl-OpenQA--Archive \
perl-OpenQA--Assets \
perl-OpenQA--BuildResults \
perl-OpenQA--CLI \
perl-OpenQA--CLI--api \
perl-OpenQA--CLI--archive \
perl-OpenQA--CLI--monitor \
perl-OpenQA--CLI--schedule \
perl-OpenQA--CacheService \
perl-OpenQA--Command \
perl-OpenQA--Config \
perl-OpenQA--Constants \
perl-OpenQA--Downloader \
perl-OpenQA--Error \
perl-OpenQA--Error--Cmd \
perl-OpenQA--Events \
perl-OpenQA--File \
perl-OpenQA--Files \
perl-OpenQA--Git \
perl-OpenQA--Git--ServerAvailability \
perl-OpenQA--JobDependencies--Constants \
perl-OpenQA--JobGroupDefaults \
perl-OpenQA--JobSettings \
perl-OpenQA--Jobs--Constants \
perl-OpenQA--LiveHandler--Controller--LiveViewHandler \
perl-OpenQA--Log \
perl-OpenQA--Markdown \
perl-OpenQA--Needles \
perl-OpenQA--Parser \
perl-OpenQA--Parser--Format--Base \
perl-OpenQA--Parser--Format--IPA \
perl-OpenQA--Parser--Format--JUnit \
perl-OpenQA--Parser--Format--KTAP \
perl-OpenQA--Parser--Format--LTP \
perl-OpenQA--Parser--Format--TAP \
perl-OpenQA--Parser--Format--XUnit \
perl-OpenQA--Parser--Result \
perl-OpenQA--Parser--Result--IPA--Info \
perl-OpenQA--Parser--Result--LTP--Environment \
perl-OpenQA--Parser--Result--LTP--SubTest \
perl-OpenQA--Parser--Result--LTP--Test \
perl-OpenQA--Parser--Result--Node \
perl-OpenQA--Parser--Result--OpenQA \
perl-OpenQA--Parser--Result--OpenQA--Results \
perl-OpenQA--Parser--Result--Output \
perl-OpenQA--Parser--Result--Test \
perl-OpenQA--Parser--Result--XUnit \
perl-OpenQA--Parser--Result--XUnit--Property \
perl-OpenQA--Parser--Results \
perl-OpenQA--Scheduler \
perl-OpenQA--Schema \
perl-OpenQA--ScreenshotDeletion \
perl-OpenQA--Script--CloneJob \
perl-OpenQA--Script--CloneJob--Command \
perl-OpenQA--Script--CloneJobSUSE \
perl-OpenQA--Setup \
perl-OpenQA--Shared--Controller--Auth \
perl-OpenQA--Shared--Controller--Running \
perl-OpenQA--Shared--Controller--Session \
perl-OpenQA--Shared--GruJob \
perl-OpenQA--Shared--Plugin--CSRF \
perl-OpenQA--Shared--Plugin--Gru \
perl-OpenQA--Shared--Plugin--SharedHelpers \
perl-OpenQA--SignalBlocker \
perl-OpenQA--Task--Asset--Download \
perl-OpenQA--Task--Asset--Limit \
perl-OpenQA--Task--AuditEvents--Limit \
perl-OpenQA--Task--Bug--Limit \
perl-OpenQA--Task--Git--Clone \
perl-OpenQA--Task--Iso--Schedule \
perl-OpenQA--Task--Job--ArchiveResults \
perl-OpenQA--Task--Job--CreateZipArchive \
perl-OpenQA--Task--Job--FinalizeResults \
perl-OpenQA--Task--Job--HookScript \
perl-OpenQA--Task--Job--Limit \
perl-OpenQA--Task--Job--Restart \
perl-OpenQA--Task--Needle--Delete \
perl-OpenQA--Task--Needle--LimitTempRefs \
perl-OpenQA--Task--Needle--Save \
perl-OpenQA--Task--Needle--Scan \
perl-OpenQA--Task--ScheduledProduct--Limit \
perl-OpenQA--Task--SignalGuard \
perl-OpenQA--Task--Table--Limit \
perl-OpenQA--Task--Utils \
perl-OpenQA--Utils \
perl-OpenQA--VcsProvider \
perl-OpenQA--WebAPI \
perl-OpenQA--WebSockets \
perl-OpenQA--Worker \
perl-OpenQA--YAML"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ntp-daemon \
perl \
perl-Archive--Zip \
perl-Carp--Always \
perl-Config--IniFiles \
perl-Cpanel--JSON--XS \
perl-Cwd \
perl-Data--Dump \
perl-Data--Dumper \
perl-Digest--MD5 \
perl-Feature--Compat--Try \
perl-Filesys--Df \
perl-Getopt--Long \
perl-HTTP--Status \
perl-IO--Interactive \
perl-Minion \
perl-Mojolicious \
perl-Regexp--Common \
perl-Storable \
perl-Text--Glob \
perl-Time--Moment"

inherit rpm
