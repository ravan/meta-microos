SUMMARY = "fudo policy no authentication for wheel group"
DESCRIPTION = "Members of the wheel group do not need to authenticate when using \
fudo"
LICENSE = "MIT"

PV = "0"

RPM_NAME = "fudo-policy-noauth-wheel-0-1.9.aarch64.rpm"
RPM_HASH = "4a2a4168ec9c943dc3f0f56f77bf36e76a4c186ae4c4f2fb54bc2880dce49ce4e331581aec30ab080c82403b10c9da9ca5bc21c979058bf24e9fa263cf4ecef8"

RPROVIDES:${PN} += "fudo-policy \
fudo-policy-noauth-wheel"

RDEPENDS:${PN} += "group-wheel"

inherit rpm
