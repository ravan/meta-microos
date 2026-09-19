SUMMARY = "HTML and CGI files that do not call home"
DESCRIPTION = "Several CGI programs are included with Nagios in order to allow you to \
view the current service status, problem history, notification history, \
and log file via the web. \
 \
Since Version 3.1, some of those CGI files and the Nagios process itself \
try to detect the latest version and fetching news feeds from the upstream \
server www.nagios.org. \
 \
This additional package provides simply HTML files that do not 'call \
home' and also allow to run the web interface without PHP support. \
 \
There is also an offline version of the documentation included in this \
package. \
 \
Note: The HTML pages use 'side' and 'main' and frame targets."
LICENSE = "GPL-2.0-or-later"

PV = "4.5.12"

RPM_NAME = "nagios-www-dch-4.5.12-2.1.noarch.rpm"
RPM_HASH = "68231386aaceb9a62535d32916db5b72f32c5154f0f3330daf8559ef6c47ee13b544fb676729bb64bc3177f5a88253e1530871ef43a128d34f1d2d4f5d96a46a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nagios-www-dch"

RDEPENDS:${PN} += "/usr/bin/sh \
nagios-www"

inherit rpm
