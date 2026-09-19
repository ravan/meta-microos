SUMMARY = "IMA EVM file signing plugin"
DESCRIPTION = "Rpm plugin for IMA EVM file signing support."
LICENSE = "GPL-2.0-or-later"

PV = "4.20.1"

RPM_NAME = "rpm-plugin-imaevmsign-4.20.1-10.1.aarch64.rpm"
RPM_HASH = "3726a4fc326e9722217718558c13345c7256f3fa639d89fe4473589ebeca6f2041acb63373eaa3232114001c4147b866213b471f94f1133922361eecdcd2f281"

RPROVIDES:${PN} += "rpm-imaevmsign \
rpm-plugin-imaevmsign"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libimaevm.so.5 \
librpm.so.10 \
librpmio.so.10 \
rpm"

inherit rpm
