SUMMARY = "Script to query Wayland window properties"
DESCRIPTION = "Shell script allowing to query window properties on Sway. \
Wayland equivalent for 'xprop'."
LICENSE = "MIT"

PV = "0~git0.758c548"

RPM_NAME = "wlprop-0~git0.758c548-1.6.aarch64.rpm"
RPM_HASH = "6688df74d8745ba77be442b79bfa9a862f54dbb492b780aa9a23833bc5b1ba7582cdf25dc5d6db71d15ddd075c89da87313f06cc3adf4eecc8458a9d143705bc"

RPROVIDES:${PN} += "wlprop"

RDEPENDS:${PN} += "/usr/bin/sh \
awk \
jq \
slurp \
sway"

inherit rpm
