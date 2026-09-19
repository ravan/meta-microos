SUMMARY = "Additional documentation or doc formats for systemd"
DESCRIPTION = "A HTML version of the systemd documentation, plus the manual pages \
for the C APIs."
LICENSE = "LGPL-2.1-or-later"

PV = "261.2"

RPM_NAME = "systemd-doc-261.2-1.2.noarch.rpm"
RPM_HASH = "0510f65314c59b071764116671163aa177eb21db1d2332a8371a71c79d17b6c0d3e4e18db1aacf9e890bb7536bedf2872625820ffd71a31f3c7aaeee46db0ebf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "systemd-doc"

RDEPENDS:${PN} += ""

inherit rpm
