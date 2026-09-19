SUMMARY = "Client tools for remote openQA management"
DESCRIPTION = "Tools and support files for openQA client script. Client script is \
a convenient helper for interacting with openQA webui REST API."
LICENSE = "GPL-2.0-or-later"

PV = "5.1788605562.29b45941"

RPM_NAME = "openQA-client-5.1788605562.29b45941-1.1.aarch64.rpm"
RPM_HASH = "45539b082556859a584b9daca8f5487ead6f4fd2ece5d0a02653171e0559fe539f944493579b235b7af078578abf710ad786fd2e47e7a2eff4a3d297b878ff2a"

RPROVIDES:${PN} += "openQA-client \
perl-OpenQA--Client \
perl-OpenQA--Client--Archive \
perl-OpenQA--Client--Handler \
perl-OpenQA--Client--Upload \
perl-OpenQA--UserAgent"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
curl \
git-core \
jq \
openQA-common \
perl-Getopt--Long--Descriptive \
perl-IO--Interactive \
perl-IO--Socket--SSL \
perl-IPC--Run \
perl-JSON--Validator \
perl-LWP--Protocol--https \
perl-LWP--UserAgent \
perl-Test--More \
perl-YAML--PP \
perl-YAML--XS"

inherit rpm
