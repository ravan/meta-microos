SUMMARY = "Miriway desktop session"
DESCRIPTION = "This package contains configuration and dependencies for the basic Miriway \
session"
LICENSE = "GPL-3.0-only"

PV = "26.06.1"

RPM_NAME = "miriway-session-26.06.1-1.2.noarch.rpm"
RPM_HASH = "1f10478d775256fcd8945846b7050653eed728a85a232c3388ac05fcba5fab921d1290943c46c895d42f01a6941f32bbb24d5d80587c011670ed806907acbf2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "miriway-session"

RDEPENDS:${PN} += "/usr/bin/sh \
miriway"

inherit rpm
