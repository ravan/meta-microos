SUMMARY = "A generic message storing mechanism"
DESCRIPTION = "Log::Message is a generic message storage mechanism. It allows you to store \
messages on a stack -- either shared or private -- and assign meta-data to \
it. Some meta-data will automatically be added for you, like a timestamp \
and a stack trace, but some can be filled in by the user, like a tag by \
which to identify it or group it, and a level at which to handle the \
message (for example, log it, or die with it) \
 \
Log::Message also provides a powerful way of searching through items by \
regexes on messages, tags and level."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.08"

RPM_NAME = "perl-Log-Message-0.08-3.42.noarch.rpm"
RPM_HASH = "67524f59faf08d1d291eb1ea5c3f08917fb5cd64f493b81ca5c8dbbf987b22dfdb063cbdf4b7ea0eb969f641d371b56f5f36a7724ecd358f5eed5e6447c3ceb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Log--Message \
perl-Log--Message--Config \
perl-Log--Message--Handlers \
perl-Log--Message--Item \
perl-Log-Message"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Locale--Maketext--Simple \
perl-Module--Load \
perl-Params--Check"

inherit rpm
