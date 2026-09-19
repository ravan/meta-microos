SUMMARY = "Fish Completion for klog"
DESCRIPTION = "Fish command line completion support for klog."
LICENSE = "MIT"

PV = "7.1"

RPM_NAME = "klog-fish-completion-7.1-1.6.noarch.rpm"
RPM_HASH = "3b62e0489f9cf5d782186aa761ddcb5c0e047b6740f006157e5b0450a719f19e7016496e451805de312f803c01f8e2653c345758bcc2c748abed9e95dff1df70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "klog-fish-completion"

RDEPENDS:${PN} += "klog"

inherit rpm
