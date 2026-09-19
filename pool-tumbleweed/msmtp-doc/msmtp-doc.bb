SUMMARY = "Documentation for msmtp"
DESCRIPTION = "msmtp is an SMTP client that can be used as a plug-in for Mutt and \
other mail user agents.  It forwards mail to an SMTP server that does \
the delivery.  msmtp supports multiple accounts. \
 \
This subpackage contains the documentation for msmtp, including \
examples and sample configuration files."
LICENSE = "GPL-3.0-or-later"

PV = "1.8.34"

RPM_NAME = "msmtp-doc-1.8.34-1.1.noarch.rpm"
RPM_HASH = "2292c7a3a6c4bc658a7c76459e63254facba6b43461928793454633b24025d2053d9121d67f94c15a24424c138e61419b00c59e313415dde34ad1325c28ebc62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "msmtp-doc"

RDEPENDS:${PN} += "msmtp"

inherit rpm
