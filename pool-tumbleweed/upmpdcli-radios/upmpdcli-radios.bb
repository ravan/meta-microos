SUMMARY = "OpenHome Radio Service media server plugin for upmpdcli"
DESCRIPTION = "Media Server plugin providing access to radios managed by the OpenHome Radio Service."
LICENSE = "GPL-2.0-or-later"

PV = "1.9.17"

RPM_NAME = "upmpdcli-radios-1.9.17-1.5.noarch.rpm"
RPM_HASH = "93f932681a6f3aa9857f069374545df4d740711bd75bef80f6b98bd527c9a2716c1e889dd87abaed4650939d02bbaf4442396d43eed4c316fdbc941ee64b8b23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "upmpdcli-radios"

RDEPENDS:${PN} += "/usr/bin/env \
python3-requests \
upmpdcli"

inherit rpm
