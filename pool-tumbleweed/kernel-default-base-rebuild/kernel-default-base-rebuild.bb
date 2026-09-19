SUMMARY = "Empty package to ensure rebuilding kernel-default-base in OBS"
DESCRIPTION = "This is empty package that ensures kernel-default-base is rebuilt every time \
kernel-default is rebuilt in OBS. \
 \
There is no reason to install this package."
LICENSE = "GPL-2.0-only"

PV = "7.2.5"

RPM_NAME = "kernel-default-base-rebuild-7.2.5-1.1.36.6.aarch64.rpm"
RPM_HASH = "fab1f88fcb6a88b8946808127f6b04c8accafc7ba27d62e9f534f4f1f1467ab0fc607b57881b085450d05768d0dfcda187c9bb8fc297d494dca61e7694de8e89"

RPROVIDES:${PN} += "kernel-default-base-rebuild"

RDEPENDS:${PN} += "kernel-default"

inherit rpm
