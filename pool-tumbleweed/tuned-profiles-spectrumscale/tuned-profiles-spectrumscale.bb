SUMMARY = "Additional tuned profile(s) optimized for IBM Spectrum Scale"
DESCRIPTION = "Additional tuned profile(s) optimized for IBM Spectrum Scale."
LICENSE = "GPL-2.0-or-later"

PV = "2.27.0.0+git.38d4414"

RPM_NAME = "tuned-profiles-spectrumscale-2.27.0.0+git.38d4414-1.2.noarch.rpm"
RPM_HASH = "79125af599ccce824f3a402d90dad71e6e79a44c4f1444cec5647f31f32d0cf90645267c01a2577a83f3c753a4bf12d26a86a10779d4c824909f1def789ae582"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuned-profiles-spectrumscale"

RDEPENDS:${PN} += "tuned"

inherit rpm
