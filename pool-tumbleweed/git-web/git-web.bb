SUMMARY = "Git Web Interface"
DESCRIPTION = "CGI script that allows browsing git repositories via web interface. \
 \
The apache2 configuration contained in this package installs a virtual \
directory /git/ that calls the cgi script."
LICENSE = "GPL-2.0-only"

PV = "2.55.0"

RPM_NAME = "git-web-2.55.0-3.2.aarch64.rpm"
RPM_HASH = "5a3a388efddda3ce8437deeca19dab36386f9eb8f77c5969b53e4a3e8b9e806910badc2142ff7afb2e821ce469d7258eeadf587b0e6ca97e2d56548a8a656c9b"

RPROVIDES:${PN} += "config-git-web \
git-web"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
git-core \
perl-CGI \
perl-Git"

inherit rpm
